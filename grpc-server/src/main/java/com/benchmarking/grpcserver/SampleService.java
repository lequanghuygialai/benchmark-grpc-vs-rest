package com.benchmarking.grpcserver;

import com.benchmarking.grpc.*;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.ArrayList;
import java.util.List;

@GrpcService
public class SampleService extends SampleServiceGrpc.SampleServiceImplBase {
    static List<BigObject> bigObjects = new ArrayList<>();

    public SampleService() {
        init();
    }

    public void init() {
        if (bigObjects.isEmpty()) {
            for (int i = 0; i < 1; i++) {
                BigObject bigObject = generatePojoObj();
                bigObjects.add(bigObject);
            }
        }
    }

    @Override
    public void get(GetRequest request, StreamObserver<GetResponse> responseObserver) {
        responseObserver.onNext(GetResponse.newBuilder().addAllBigObjects(bigObjects).build());
        responseObserver.onCompleted();
    }

    private BigObject generatePojoObj() {
        return BigObject.newBuilder()
                .setF1(1L)
                .setF2(2L)
                .setF3(3L)
                .setF4(4L)
                .setF5(5L)
                .setF6(6L)
                .setF7(7L)
                .setF8(8L)
                .setF9(9L)
                .setF10(10L)
                .setF11("string")
                .setF12("string")
                .setF13("string")
                .setF14("string")
                .setF15("string")
                .setF16("string")
                .setF17("string")
                .setF18("string")
                .setF19("string")
                .setF20("string")
                .setF21(true)
                .setF22(true)
                .setF23(true)
                .setF24(true)
                .setF25(true)
                .setF26(true)
                .setF27(true)
                .setF28(true)
                .setF29(true)
                .setF30(true)
                .setF31(1)
                .setF32(1)
                .setF33(1)
                .setF34(1)
                .setF35(1)
                .setF36(1)
                .setF37(1)
                .setF38(1)
                .setF39(1)
                .setF40(1)
                .setF41(2)
                .setF42(2)
                .setF43(2)
                .setF44(2)
                .setF45(2)
                .setF46(2)
                .setF47(2)
                .setF48(2)
                .setF49(2)
                .setF50(2)
                .setF51(E.E1)
                .setF52(E.E2)
                .setF53(E.E3)
                .setF54(E.E4)
                .setF55(E.E5)
                .setF56(E.E5)
                .setF57(E.E5)
                .setF58(E.E5)
                .setF59(E.E5)
                .setF60(E.E5)
                .setF61(fClassGenerate())
                .setF62(fClassGenerate())
                .setF63(fClassGenerate())
                .setF64(fClassGenerate())
                .setF65(fClassGenerate())
                .setF66(fClassGenerate())
                .setF67(fClassGenerate())
                .setF68(fClassGenerate())
                .setF69(fClassGenerate())
                .setF70(fClassGenerate())
                .build();

    }

    private FClass fClassGenerate() {
        return FClass
                .newBuilder()
                .setFClass1(1L)
                .setFClass2(1L)
                .setFClass3(1L)
                .setFClass4(1L)
                .setFClass5(1L)
                .setFClass6(1L)
                .setFClass7(1L)
                .setFClass8(1L)
                .setFClass9(1L)
                .setFClass10(1L)
                .build();
    }
}
