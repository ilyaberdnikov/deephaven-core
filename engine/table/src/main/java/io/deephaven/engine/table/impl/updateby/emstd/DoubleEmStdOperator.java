/*
 * ---------------------------------------------------------------------------------------------------------------------
 * AUTO-GENERATED CLASS - DO NOT EDIT MANUALLY - for any changes edit CharEmStdOperator and regenerate
 * ---------------------------------------------------------------------------------------------------------------------
 */
/*
 * ---------------------------------------------------------------------------------------------------------------------
 * AUTO-GENERATED CLASS - DO NOT EDIT MANUALLY - for any changes edit FloatEmStdOperator and regenerate
 * ---------------------------------------------------------------------------------------------------------------------
 */
package io.deephaven.engine.table.impl.updateby.emstd;

import io.deephaven.api.updateby.BadDataBehavior;
import io.deephaven.api.updateby.OperationControl;
import io.deephaven.chunk.Chunk;
import io.deephaven.chunk.LongChunk;
import io.deephaven.chunk.DoubleChunk;
import io.deephaven.chunk.attributes.Values;
import io.deephaven.engine.rowset.RowSequence;
import io.deephaven.engine.table.ColumnSource;
import io.deephaven.engine.table.MatchPair;
import io.deephaven.engine.table.impl.updateby.UpdateByOperator;
import io.deephaven.engine.table.impl.util.RowRedirection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import static io.deephaven.util.QueryConstants.*;

/***
 * Compute an exponential moving standard deviation for a double column source.  The output is expressed as a double
 * value and is computed using the following formula:
 *
 * variance = alpha * (prevVariance + (1 - alpha) * (x - prevEma)^2)
 *
 * This function is described in the following document:
 *
 * "Incremental calculation of weighted mean and variance"
 * Tony Finch, University of Cambridge Computing Service (February 2009)
 * https://web.archive.org/web/20181222175223/http://people.ds.cam.ac.uk/fanf2/hermes/doc/antiforgery/stats.pdf
 *
 * NOTE: `alpha` as used in the paper has been replaced with `1 - alpha` per the convention adopted by Deephaven.
 */
public class DoubleEmStdOperator extends BasePrimitiveEmStdOperator {
    public final ColumnSource<?> valueSource;

    protected class Context extends BasePrimitiveEmStdOperator.Context {

        public DoubleChunk<? extends Values> doubleValueChunk;

        protected Context(final int affectedChunkSize, final int influencerChunkSize) {
            super(affectedChunkSize);
        }

        @Override
        public void accumulateCumulative(@NotNull RowSequence inputKeys,
                                         Chunk<? extends Values>[] valueChunkArr,
                                         LongChunk<? extends Values> tsChunk,
                                         int len) {
            setValueChunks(valueChunkArr);

            // chunk processing
            if (timestampColumnName == null) {
                // compute with ticks
                for (int ii = 0; ii < len; ii++) {
                    // read the value from the values chunk
                    final double input = doubleValueChunk.get(ii);
                    final boolean isNull = input == NULL_DOUBLE;
                    final boolean isNan = Double.isNaN(input);

                    if (isNull || isNan) {
                        handleBadData(this, isNull, isNan);
                    } else {
                        if (curEma == NULL_DOUBLE) {
                            curEma = input;
                            curVariance = 0.0;
                            curVal = Double.NaN;
                        } else {
                            //  incremental variance = alpha * (prevVariance + (1 - alpha) * (x - prevEma)^2)
                            curVariance = opAlpha * (curVariance + opOneMinusAlpha * Math.pow(input - curEma, 2.0));

                            final double decayedEmaVal = curEma * opAlpha;
                            curEma =  decayedEmaVal + (opOneMinusAlpha * input);
                            curVal = Math.sqrt(curVariance);
                        }
                    }
                    outputValues.set(ii, curVal);
                    if (emaValues != null) {
                        emaValues.set(ii, curEma);
                    }
                }
            } else {
                // compute with time
                for (int ii = 0; ii < len; ii++) {
                    // read the value from the values chunk
                    final double input = doubleValueChunk.get(ii);
                    final long timestamp = tsChunk.get(ii);
                    //noinspection ConstantConditions
                    final boolean isNull = input == NULL_DOUBLE;
                    final boolean isNan = Double.isNaN(input);
                    final boolean isNullTime = timestamp == NULL_LONG;

                    // Handle bad data first
                    if (isNull || isNan) {
                        handleBadData(this, isNull, isNan);
                    } else if (isNullTime) {
                        // no change to curVal and lastStamp
                    } else if (curEma == NULL_DOUBLE) {
                        curEma = input;
                        curVariance = 0.0;
                        curVal = Double.NaN;
                        lastStamp = timestamp;
                    } else {
                        final long dt = timestamp - lastStamp;
                        if (dt != lastDt) {
                            // Alpha is dynamic based on time, but only recalculated when needed
                            alpha = Math.exp(-dt / reverseWindowScaleUnits);
                            oneMinusAlpha = 1.0 - alpha;
                            lastDt = dt;
                        }
                        //  incremental variance = alpha * (prevVariance + (1 - alpha) * (x - prevEma)^2)
                        curVariance = alpha * (curVariance + oneMinusAlpha * Math.pow(input - curEma, 2.0));

                        final double decayedEmaVal = curEma * alpha;
                        curEma =  decayedEmaVal + (oneMinusAlpha * input);
                        curVal = Math.sqrt(curVariance);

                        lastStamp = timestamp;
                    }
                    outputValues.set(ii, curVal);
                    if (emaValues != null) {
                        emaValues.set(ii, curEma);
                    }
                }
            }

            // chunk output to column
            writeToOutputColumn(inputKeys);
        }

        @Override
        public void writeToOutputColumn(@NotNull final RowSequence inputKeys) {
            outputSource.fillFromChunk(outputFillContext, outputValues, inputKeys);
            if (emaValues != null) {
                emaSource.fillFromChunk(emaFillContext, emaValues, inputKeys);
            }
        }

        @Override
        public void setValueChunks(@NotNull final Chunk<? extends Values>[] valuesChunks) {
            doubleValueChunk = valuesChunks[0].asDoubleChunk();
        }

        @Override
        public boolean isValueValid(long atKey) {
            final double value = valueSource.getDouble(atKey);
            if (value == NULL_DOUBLE) {
                return false;
            }
            return !Double.isNaN(value) || control.onNanValueOrDefault() != BadDataBehavior.SKIP;

        }
    }

    /**
     * An operator that computes an exponential moving standard deviation from a double column using an exponential
     * decay function.
     *
     * @param pair                the {@link MatchPair} that defines the input/output for this operation
     * @param affectingColumns    the names of the columns that affect this ema
     * @param rowRedirection      the {@link RowRedirection} to use for dense output sources
     * @param control             defines how to handle {@code null} input values.
     * @param timestampColumnName the name of the column containing timestamps for time-based calcuations
     * @param windowScaleUnits      the smoothing window for the EMA. If no {@code timestampColumnName} is provided, this is measured in ticks, otherwise it is measured in nanoseconds
     * @param valueSource         a reference to the input column source for this operation
     */
    public DoubleEmStdOperator(@NotNull final MatchPair pair,
                              @NotNull final String[] affectingColumns,
                              @Nullable final RowRedirection rowRedirection,
                              @NotNull final OperationControl control,
                              @Nullable final String timestampColumnName,
                              final double windowScaleUnits,
                              final ColumnSource<?> valueSource,
                              final boolean sourceRefreshing
                              // region extra-constructor-args
                              // endregion extra-constructor-args
    ) {
        super(pair, affectingColumns, rowRedirection, control, timestampColumnName, windowScaleUnits, sourceRefreshing);
        this.valueSource = valueSource;
        // region constructor
        // endregion constructor
    }

    @NotNull
    @Override
    public UpdateByOperator.Context makeUpdateContext(final int affectedChunkSize, final int influencerChunkSize) {
        return new Context(affectedChunkSize, influencerChunkSize);
    }
}