// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SpecialTypesV1.proto

package io.deephaven.kafka.protobuf.gen;

public final class SpecialTypesV1 {
  private SpecialTypesV1() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SpecialTypesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:io.deephaven.kafka.test.SpecialTypes)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * well-known
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts = 1;</code>
     * @return Whether the ts field is set.
     */
    boolean hasTs();
    /**
     * <pre>
     * well-known
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts = 1;</code>
     * @return The ts.
     */
    com.google.protobuf.Timestamp getTs();
    /**
     * <pre>
     * well-known
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts = 1;</code>
     */
    com.google.protobuf.TimestampOrBuilder getTsOrBuilder();

    /**
     * <pre>
     * byte[] vs ByteString
     * </pre>
     *
     * <code>bytes bs = 2;</code>
     * @return The bs.
     */
    com.google.protobuf.ByteString getBs();

    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */
    int getMpCount();
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */
    boolean containsMp(
        int key);
    /**
     * Use {@link #getMpMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getMp();
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getMpMap();
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */

    int getMpOrDefault(
        int key,
        int defaultValue);
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */

    int getMpOrThrow(
        int key);
  }
  /**
   * Protobuf type {@code io.deephaven.kafka.test.SpecialTypes}
   */
  public static final class SpecialTypes extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:io.deephaven.kafka.test.SpecialTypes)
      SpecialTypesOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SpecialTypes.newBuilder() to construct.
    private SpecialTypes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SpecialTypes() {
      bs_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SpecialTypes();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return SpecialTypesV1.internal_static_io_deephaven_kafka_test_SpecialTypes_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 3:
          return internalGetMp();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return SpecialTypesV1.internal_static_io_deephaven_kafka_test_SpecialTypes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SpecialTypesV1.SpecialTypes.class, SpecialTypesV1.SpecialTypes.Builder.class);
    }

    public static final int TS_FIELD_NUMBER = 1;
    private com.google.protobuf.Timestamp ts_;
    /**
     * <pre>
     * well-known
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts = 1;</code>
     * @return Whether the ts field is set.
     */
    @java.lang.Override
    public boolean hasTs() {
      return ts_ != null;
    }
    /**
     * <pre>
     * well-known
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts = 1;</code>
     * @return The ts.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getTs() {
      return ts_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : ts_;
    }
    /**
     * <pre>
     * well-known
     * </pre>
     *
     * <code>.google.protobuf.Timestamp ts = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getTsOrBuilder() {
      return getTs();
    }

    public static final int BS_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString bs_;
    /**
     * <pre>
     * byte[] vs ByteString
     * </pre>
     *
     * <code>bytes bs = 2;</code>
     * @return The bs.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBs() {
      return bs_;
    }

    public static final int MP_FIELD_NUMBER = 3;
    private static final class MpDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  SpecialTypesV1.internal_static_io_deephaven_kafka_test_SpecialTypes_MpEntry_descriptor,
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.INT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> mp_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetMp() {
      if (mp_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            MpDefaultEntryHolder.defaultEntry);
      }
      return mp_;
    }

    public int getMpCount() {
      return internalGetMp().getMap().size();
    }
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */

    @java.lang.Override
    public boolean containsMp(
        int key) {
      
      return internalGetMp().getMap().containsKey(key);
    }
    /**
     * Use {@link #getMpMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getMp() {
      return getMpMap();
    }
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getMpMap() {
      return internalGetMp().getMap();
    }
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */
    @java.lang.Override

    public int getMpOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetMp().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Map vs repeated MapFieldEntry
     * </pre>
     *
     * <code>map&lt;int32, int32&gt; mp = 3;</code>
     */
    @java.lang.Override

    public int getMpOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetMp().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (ts_ != null) {
        output.writeMessage(1, getTs());
      }
      if (!bs_.isEmpty()) {
        output.writeBytes(2, bs_);
      }
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetMp(),
          MpDefaultEntryHolder.defaultEntry,
          3);
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (ts_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getTs());
      }
      if (!bs_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, bs_);
      }
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetMp().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        mp__ = MpDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(3, mp__);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof SpecialTypesV1.SpecialTypes)) {
        return super.equals(obj);
      }
      SpecialTypesV1.SpecialTypes other = (SpecialTypesV1.SpecialTypes) obj;

      if (hasTs() != other.hasTs()) return false;
      if (hasTs()) {
        if (!getTs()
            .equals(other.getTs())) return false;
      }
      if (!getBs()
          .equals(other.getBs())) return false;
      if (!internalGetMp().equals(
          other.internalGetMp())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasTs()) {
        hash = (37 * hash) + TS_FIELD_NUMBER;
        hash = (53 * hash) + getTs().hashCode();
      }
      hash = (37 * hash) + BS_FIELD_NUMBER;
      hash = (53 * hash) + getBs().hashCode();
      if (!internalGetMp().getMap().isEmpty()) {
        hash = (37 * hash) + MP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetMp().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static SpecialTypesV1.SpecialTypes parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static SpecialTypesV1.SpecialTypes parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static SpecialTypesV1.SpecialTypes parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static SpecialTypesV1.SpecialTypes parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(SpecialTypesV1.SpecialTypes prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code io.deephaven.kafka.test.SpecialTypes}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:io.deephaven.kafka.test.SpecialTypes)
        SpecialTypesV1.SpecialTypesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return SpecialTypesV1.internal_static_io_deephaven_kafka_test_SpecialTypes_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMp();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 3:
            return internalGetMutableMp();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return SpecialTypesV1.internal_static_io_deephaven_kafka_test_SpecialTypes_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                SpecialTypesV1.SpecialTypes.class, SpecialTypesV1.SpecialTypes.Builder.class);
      }

      // Construct using io.deephaven.kafka.test.SpecialTypesV1.SpecialTypes.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (tsBuilder_ == null) {
          ts_ = null;
        } else {
          ts_ = null;
          tsBuilder_ = null;
        }
        bs_ = com.google.protobuf.ByteString.EMPTY;

        internalGetMutableMp().clear();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return SpecialTypesV1.internal_static_io_deephaven_kafka_test_SpecialTypes_descriptor;
      }

      @java.lang.Override
      public SpecialTypesV1.SpecialTypes getDefaultInstanceForType() {
        return SpecialTypesV1.SpecialTypes.getDefaultInstance();
      }

      @java.lang.Override
      public SpecialTypesV1.SpecialTypes build() {
        SpecialTypesV1.SpecialTypes result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public SpecialTypesV1.SpecialTypes buildPartial() {
        SpecialTypesV1.SpecialTypes result = new SpecialTypesV1.SpecialTypes(this);
        int from_bitField0_ = bitField0_;
        if (tsBuilder_ == null) {
          result.ts_ = ts_;
        } else {
          result.ts_ = tsBuilder_.build();
        }
        result.bs_ = bs_;
        result.mp_ = internalGetMp();
        result.mp_.makeImmutable();
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof SpecialTypesV1.SpecialTypes) {
          return mergeFrom((SpecialTypesV1.SpecialTypes)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(SpecialTypesV1.SpecialTypes other) {
        if (other == SpecialTypesV1.SpecialTypes.getDefaultInstance()) return this;
        if (other.hasTs()) {
          mergeTs(other.getTs());
        }
        if (other.getBs() != com.google.protobuf.ByteString.EMPTY) {
          setBs(other.getBs());
        }
        internalGetMutableMp().mergeFrom(
            other.internalGetMp());
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getTsFieldBuilder().getBuilder(),
                    extensionRegistry);

                break;
              } // case 10
              case 18: {
                bs_ = input.readBytes();

                break;
              } // case 18
              case 26: {
                com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
                mp__ = input.readMessage(
                    MpDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
                internalGetMutableMp().getMutableMap().put(
                    mp__.getKey(), mp__.getValue());
                break;
              } // case 26
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Timestamp ts_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> tsBuilder_;
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       * @return Whether the ts field is set.
       */
      public boolean hasTs() {
        return tsBuilder_ != null || ts_ != null;
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       * @return The ts.
       */
      public com.google.protobuf.Timestamp getTs() {
        if (tsBuilder_ == null) {
          return ts_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : ts_;
        } else {
          return tsBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       */
      public Builder setTs(com.google.protobuf.Timestamp value) {
        if (tsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ts_ = value;
          onChanged();
        } else {
          tsBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       */
      public Builder setTs(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (tsBuilder_ == null) {
          ts_ = builderForValue.build();
          onChanged();
        } else {
          tsBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       */
      public Builder mergeTs(com.google.protobuf.Timestamp value) {
        if (tsBuilder_ == null) {
          if (ts_ != null) {
            ts_ =
              com.google.protobuf.Timestamp.newBuilder(ts_).mergeFrom(value).buildPartial();
          } else {
            ts_ = value;
          }
          onChanged();
        } else {
          tsBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       */
      public Builder clearTs() {
        if (tsBuilder_ == null) {
          ts_ = null;
          onChanged();
        } else {
          ts_ = null;
          tsBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       */
      public com.google.protobuf.Timestamp.Builder getTsBuilder() {
        
        onChanged();
        return getTsFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getTsOrBuilder() {
        if (tsBuilder_ != null) {
          return tsBuilder_.getMessageOrBuilder();
        } else {
          return ts_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : ts_;
        }
      }
      /**
       * <pre>
       * well-known
       * </pre>
       *
       * <code>.google.protobuf.Timestamp ts = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getTsFieldBuilder() {
        if (tsBuilder_ == null) {
          tsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getTs(),
                  getParentForChildren(),
                  isClean());
          ts_ = null;
        }
        return tsBuilder_;
      }

      private com.google.protobuf.ByteString bs_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       * byte[] vs ByteString
       * </pre>
       *
       * <code>bytes bs = 2;</code>
       * @return The bs.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getBs() {
        return bs_;
      }
      /**
       * <pre>
       * byte[] vs ByteString
       * </pre>
       *
       * <code>bytes bs = 2;</code>
       * @param value The bs to set.
       * @return This builder for chaining.
       */
      public Builder setBs(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        bs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * byte[] vs ByteString
       * </pre>
       *
       * <code>bytes bs = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBs() {
        
        bs_ = getDefaultInstance().getBs();
        onChanged();
        return this;
      }

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> mp_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMp() {
        if (mp_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              MpDefaultEntryHolder.defaultEntry);
        }
        return mp_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableMp() {
        onChanged();;
        if (mp_ == null) {
          mp_ = com.google.protobuf.MapField.newMapField(
              MpDefaultEntryHolder.defaultEntry);
        }
        if (!mp_.isMutable()) {
          mp_ = mp_.copy();
        }
        return mp_;
      }

      public int getMpCount() {
        return internalGetMp().getMap().size();
      }
      /**
       * <pre>
       * Map vs repeated MapFieldEntry
       * </pre>
       *
       * <code>map&lt;int32, int32&gt; mp = 3;</code>
       */

      @java.lang.Override
      public boolean containsMp(
          int key) {
        
        return internalGetMp().getMap().containsKey(key);
      }
      /**
       * Use {@link #getMpMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getMp() {
        return getMpMap();
      }
      /**
       * <pre>
       * Map vs repeated MapFieldEntry
       * </pre>
       *
       * <code>map&lt;int32, int32&gt; mp = 3;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getMpMap() {
        return internalGetMp().getMap();
      }
      /**
       * <pre>
       * Map vs repeated MapFieldEntry
       * </pre>
       *
       * <code>map&lt;int32, int32&gt; mp = 3;</code>
       */
      @java.lang.Override

      public int getMpOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetMp().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <pre>
       * Map vs repeated MapFieldEntry
       * </pre>
       *
       * <code>map&lt;int32, int32&gt; mp = 3;</code>
       */
      @java.lang.Override

      public int getMpOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetMp().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearMp() {
        internalGetMutableMp().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <pre>
       * Map vs repeated MapFieldEntry
       * </pre>
       *
       * <code>map&lt;int32, int32&gt; mp = 3;</code>
       */

      public Builder removeMp(
          int key) {
        
        internalGetMutableMp().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableMp() {
        return internalGetMutableMp().getMutableMap();
      }
      /**
       * <pre>
       * Map vs repeated MapFieldEntry
       * </pre>
       *
       * <code>map&lt;int32, int32&gt; mp = 3;</code>
       */
      public Builder putMp(
          int key,
          int value) {
        
        
        internalGetMutableMp().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <pre>
       * Map vs repeated MapFieldEntry
       * </pre>
       *
       * <code>map&lt;int32, int32&gt; mp = 3;</code>
       */

      public Builder putAllMp(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableMp().getMutableMap()
            .putAll(values);
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:io.deephaven.kafka.test.SpecialTypes)
    }

    // @@protoc_insertion_point(class_scope:io.deephaven.kafka.test.SpecialTypes)
    private static final SpecialTypesV1.SpecialTypes DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new SpecialTypesV1.SpecialTypes();
    }

    public static SpecialTypesV1.SpecialTypes getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SpecialTypes>
        PARSER = new com.google.protobuf.AbstractParser<SpecialTypes>() {
      @java.lang.Override
      public SpecialTypes parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<SpecialTypes> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SpecialTypes> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public SpecialTypesV1.SpecialTypes getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_deephaven_kafka_test_SpecialTypes_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_deephaven_kafka_test_SpecialTypes_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_io_deephaven_kafka_test_SpecialTypes_MpEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_io_deephaven_kafka_test_SpecialTypes_MpEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024SpecialTypesV1.proto\022\027io.deephaven.kaf" +
      "ka.test\032\037google/protobuf/timestamp.proto" +
      "\"\250\001\n\014SpecialTypes\022&\n\002ts\030\001 \001(\0132\032.google.p" +
      "rotobuf.Timestamp\022\n\n\002bs\030\002 \001(\014\0229\n\002mp\030\003 \003(" +
      "\0132-.io.deephaven.kafka.test.SpecialTypes" +
      ".MpEntry\032)\n\007MpEntry\022\013\n\003key\030\001 \001(\005\022\r\n\005valu" +
      "e\030\002 \001(\005:\0028\001B\004H\001P\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_io_deephaven_kafka_test_SpecialTypes_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_io_deephaven_kafka_test_SpecialTypes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_deephaven_kafka_test_SpecialTypes_descriptor,
        new java.lang.String[] { "Ts", "Bs", "Mp", });
    internal_static_io_deephaven_kafka_test_SpecialTypes_MpEntry_descriptor =
      internal_static_io_deephaven_kafka_test_SpecialTypes_descriptor.getNestedTypes().get(0);
    internal_static_io_deephaven_kafka_test_SpecialTypes_MpEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_io_deephaven_kafka_test_SpecialTypes_MpEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
