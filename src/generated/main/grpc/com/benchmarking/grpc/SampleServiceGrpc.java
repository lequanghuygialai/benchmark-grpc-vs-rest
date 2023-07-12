package com.benchmarking.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.1)",
    comments = "Source: SampleService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SampleServiceGrpc {

  private SampleServiceGrpc() {}

  public static final String SERVICE_NAME = "com.benchmarking.grpc.SampleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.benchmarking.grpc.GetRequest,
      com.benchmarking.grpc.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = com.benchmarking.grpc.GetRequest.class,
      responseType = com.benchmarking.grpc.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.benchmarking.grpc.GetRequest,
      com.benchmarking.grpc.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.benchmarking.grpc.GetRequest, com.benchmarking.grpc.GetResponse> getGetMethod;
    if ((getGetMethod = SampleServiceGrpc.getGetMethod) == null) {
      synchronized (SampleServiceGrpc.class) {
        if ((getGetMethod = SampleServiceGrpc.getGetMethod) == null) {
          SampleServiceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.benchmarking.grpc.GetRequest, com.benchmarking.grpc.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.benchmarking.grpc.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.benchmarking.grpc.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SampleServiceMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceStub>() {
        @java.lang.Override
        public SampleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceStub(channel, callOptions);
        }
      };
    return SampleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceBlockingStub>() {
        @java.lang.Override
        public SampleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceBlockingStub(channel, callOptions);
        }
      };
    return SampleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SampleServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SampleServiceFutureStub>() {
        @java.lang.Override
        public SampleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SampleServiceFutureStub(channel, callOptions);
        }
      };
    return SampleServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void get(com.benchmarking.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<com.benchmarking.grpc.GetResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SampleService.
   */
  public static abstract class SampleServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SampleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SampleService.
   */
  public static final class SampleServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SampleServiceStub> {
    private SampleServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceStub(channel, callOptions);
    }

    /**
     */
    public void get(com.benchmarking.grpc.GetRequest request,
        io.grpc.stub.StreamObserver<com.benchmarking.grpc.GetResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SampleService.
   */
  public static final class SampleServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SampleServiceBlockingStub> {
    private SampleServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.benchmarking.grpc.GetResponse get(com.benchmarking.grpc.GetRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SampleService.
   */
  public static final class SampleServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SampleServiceFutureStub> {
    private SampleServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SampleServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.benchmarking.grpc.GetResponse> get(
        com.benchmarking.grpc.GetRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.benchmarking.grpc.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.benchmarking.grpc.GetResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.benchmarking.grpc.GetRequest,
              com.benchmarking.grpc.GetResponse>(
                service, METHODID_GET)))
        .build();
  }

  private static abstract class SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.benchmarking.grpc.SampleServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SampleService");
    }
  }

  private static final class SampleServiceFileDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier {
    SampleServiceFileDescriptorSupplier() {}
  }

  private static final class SampleServiceMethodDescriptorSupplier
      extends SampleServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleServiceFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
