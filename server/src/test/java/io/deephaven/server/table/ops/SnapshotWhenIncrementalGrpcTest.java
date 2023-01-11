package io.deephaven.server.table.ops;

import io.deephaven.proto.backplane.grpc.SnapshotWhenTableRequest;
import io.deephaven.proto.backplane.grpc.SnapshotWhenTableRequest.Builder;

public class SnapshotWhenIncrementalGrpcTest extends SnapshotWhenGrpcTestBase {

    @Override
    public Builder builder() {
        return SnapshotWhenTableRequest.newBuilder().setIncremental(true);
    }
}