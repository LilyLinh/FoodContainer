package org.example.foodcontainer.foodstorageservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: FoodStorageService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FoodStorageServiceGrpc {

  private FoodStorageServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.sample.FoodContainer.FoodStorageService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest,
      org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse> getFruitStorageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "fruitStorage",
      requestType = org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest.class,
      responseType = org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest,
      org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse> getFruitStorageMethod() {
    io.grpc.MethodDescriptor<org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest, org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse> getFruitStorageMethod;
    if ((getFruitStorageMethod = FoodStorageServiceGrpc.getFruitStorageMethod) == null) {
      synchronized (FoodStorageServiceGrpc.class) {
        if ((getFruitStorageMethod = FoodStorageServiceGrpc.getFruitStorageMethod) == null) {
          FoodStorageServiceGrpc.getFruitStorageMethod = getFruitStorageMethod =
              io.grpc.MethodDescriptor.<org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest, org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "fruitStorage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FoodStorageServiceMethodDescriptorSupplier("fruitStorage"))
              .build();
        }
      }
    }
    return getFruitStorageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FoodStorageServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodStorageServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodStorageServiceStub>() {
        @java.lang.Override
        public FoodStorageServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodStorageServiceStub(channel, callOptions);
        }
      };
    return FoodStorageServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FoodStorageServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodStorageServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodStorageServiceBlockingStub>() {
        @java.lang.Override
        public FoodStorageServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodStorageServiceBlockingStub(channel, callOptions);
        }
      };
    return FoodStorageServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FoodStorageServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FoodStorageServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FoodStorageServiceFutureStub>() {
        @java.lang.Override
        public FoodStorageServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FoodStorageServiceFutureStub(channel, callOptions);
        }
      };
    return FoodStorageServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary
     * </pre>
     */
    default void fruitStorage(org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest request,
        io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFruitStorageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FoodStorageService.
   */
  public static abstract class FoodStorageServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FoodStorageServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FoodStorageService.
   */
  public static final class FoodStorageServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FoodStorageServiceStub> {
    private FoodStorageServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodStorageServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodStorageServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public void fruitStorage(org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest request,
        io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFruitStorageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FoodStorageService.
   */
  public static final class FoodStorageServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FoodStorageServiceBlockingStub> {
    private FoodStorageServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodStorageServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodStorageServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse fruitStorage(org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFruitStorageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FoodStorageService.
   */
  public static final class FoodStorageServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FoodStorageServiceFutureStub> {
    private FoodStorageServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FoodStorageServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FoodStorageServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse> fruitStorage(
        org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFruitStorageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FRUIT_STORAGE = 0;

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
        case METHODID_FRUIT_STORAGE:
          serviceImpl.fruitStorage((org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest) request,
              (io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse>) responseObserver);
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
          getFruitStorageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.example.foodcontainer.foodstorageservice.FoodStorageServiceRequest,
              org.example.foodcontainer.foodstorageservice.FoodStorageServiceResponse>(
                service, METHODID_FRUIT_STORAGE)))
        .build();
  }

  private static abstract class FoodStorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FoodStorageServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FoodStorageService");
    }
  }

  private static final class FoodStorageServiceFileDescriptorSupplier
      extends FoodStorageServiceBaseDescriptorSupplier {
    FoodStorageServiceFileDescriptorSupplier() {}
  }

  private static final class FoodStorageServiceMethodDescriptorSupplier
      extends FoodStorageServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FoodStorageServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FoodStorageServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FoodStorageServiceFileDescriptorSupplier())
              .addMethod(getFruitStorageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
