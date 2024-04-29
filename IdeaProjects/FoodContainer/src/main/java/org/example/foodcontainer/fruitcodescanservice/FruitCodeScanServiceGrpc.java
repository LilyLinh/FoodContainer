package org.example.foodcontainer.fruitcodescanservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: FruitCodeScanService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FruitCodeScanServiceGrpc {

  private FruitCodeScanServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.FoodContainer.FruitCodeScanService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest,
      org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse> getFruitCodeScanRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fruitCodeScanRequest",
      requestType = org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest.class,
      responseType = org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest,
      org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse> getFruitCodeScanRequestMethod() {
    io.grpc.MethodDescriptor<org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest, org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse> getFruitCodeScanRequestMethod;
    if ((getFruitCodeScanRequestMethod = FruitCodeScanServiceGrpc.getFruitCodeScanRequestMethod) == null) {
      synchronized (FruitCodeScanServiceGrpc.class) {
        if ((getFruitCodeScanRequestMethod = FruitCodeScanServiceGrpc.getFruitCodeScanRequestMethod) == null) {
          FruitCodeScanServiceGrpc.getFruitCodeScanRequestMethod = getFruitCodeScanRequestMethod =
              io.grpc.MethodDescriptor.<org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest, org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fruitCodeScanRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FruitCodeScanServiceMethodDescriptorSupplier("fruitCodeScanRequest"))
              .build();
        }
      }
    }
    return getFruitCodeScanRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FruitCodeScanServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FruitCodeScanServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FruitCodeScanServiceStub>() {
        @java.lang.Override
        public FruitCodeScanServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FruitCodeScanServiceStub(channel, callOptions);
        }
      };
    return FruitCodeScanServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FruitCodeScanServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FruitCodeScanServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FruitCodeScanServiceBlockingStub>() {
        @java.lang.Override
        public FruitCodeScanServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FruitCodeScanServiceBlockingStub(channel, callOptions);
        }
      };
    return FruitCodeScanServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FruitCodeScanServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FruitCodeScanServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FruitCodeScanServiceFutureStub>() {
        @java.lang.Override
        public FruitCodeScanServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FruitCodeScanServiceFutureStub(channel, callOptions);
        }
      };
    return FruitCodeScanServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void fruitCodeScanRequest(org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest request,
        io.grpc.stub.StreamObserver<org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFruitCodeScanRequestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FruitCodeScanService.
   */
  public static abstract class FruitCodeScanServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FruitCodeScanServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FruitCodeScanService.
   */
  public static final class FruitCodeScanServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FruitCodeScanServiceStub> {
    private FruitCodeScanServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FruitCodeScanServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FruitCodeScanServiceStub(channel, callOptions);
    }

    /**
     */
    public void fruitCodeScanRequest(org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest request,
        io.grpc.stub.StreamObserver<org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFruitCodeScanRequestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FruitCodeScanService.
   */
  public static final class FruitCodeScanServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FruitCodeScanServiceBlockingStub> {
    private FruitCodeScanServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FruitCodeScanServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FruitCodeScanServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse fruitCodeScanRequest(org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFruitCodeScanRequestMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FruitCodeScanService.
   */
  public static final class FruitCodeScanServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FruitCodeScanServiceFutureStub> {
    private FruitCodeScanServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FruitCodeScanServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FruitCodeScanServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse> fruitCodeScanRequest(
        org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFruitCodeScanRequestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FRUIT_CODE_SCAN_REQUEST = 0;

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
        case METHODID_FRUIT_CODE_SCAN_REQUEST:
          serviceImpl.fruitCodeScanRequest((org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest) request,
              (io.grpc.stub.StreamObserver<org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse>) responseObserver);
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
          getFruitCodeScanRequestMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.foodcontainer.fruitcodescanservice.StreamFruitCodeScanRequest,
              org.example.foodcontainer.fruitcodescanservice.FruitCodeScanResponse>(
                service, METHODID_FRUIT_CODE_SCAN_REQUEST)))
        .build();
  }

  private static abstract class FruitCodeScanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FruitCodeScanServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.foodcontainer.fruitcodescanservice.FruitCodeScanServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FruitCodeScanService");
    }
  }

  private static final class FruitCodeScanServiceFileDescriptorSupplier
      extends FruitCodeScanServiceBaseDescriptorSupplier {
    FruitCodeScanServiceFileDescriptorSupplier() {}
  }

  private static final class FruitCodeScanServiceMethodDescriptorSupplier
      extends FruitCodeScanServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FruitCodeScanServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FruitCodeScanServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FruitCodeScanServiceFileDescriptorSupplier())
              .addMethod(getFruitCodeScanRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
