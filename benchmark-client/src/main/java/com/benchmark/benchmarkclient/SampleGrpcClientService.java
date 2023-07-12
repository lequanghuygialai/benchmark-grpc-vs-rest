package com.benchmark.benchmarkclient;

import com.benchmarking.grpc.GetRequest;
import com.benchmarking.grpc.GetResponse;
import com.benchmarking.grpc.SampleServiceGrpc;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
public class SampleGrpcClientService {
    @GrpcClient("grpc-client")
    SampleServiceGrpc.SampleServiceBlockingStub sampleServiceBlockingStub;

    public GetResponse getBigObjects() {
        GetRequest request = GetRequest.newBuilder()
                .build();
        return sampleServiceBlockingStub.get(request);
    }
}
