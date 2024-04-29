package org.example.foodcontainer.foodstorageservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: FruitOrderService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FruitOrderServiceGrpc {

  private FruitOrderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.FoodContainer.FruitOrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest,
      org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse> getStreamClientFruitTypeOrderRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamClientFruitTypeOrderRequest",
      requestType = org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest.class,
      responseType = org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest,
      org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse> getStreamClientFruitTypeOrderRequestMethod() {
    io.grpc.MethodDescriptor<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest, org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse> getStreamClientFruitTypeOrderRequestMethod;
    if ((getStreamClientFruitTypeOrderRequestMethod = FruitOrderServiceGrpc.getStreamClientFruitTypeOrderRequestMethod) == null) {
      synchronized (FruitOrderServiceGrpc.class) {
        if ((getStreamClientFruitTypeOrderRequestMethod = FruitOrderServiceGrpc.getStreamClientFruitTypeOrderRequestMethod) == null) {
          FruitOrderServiceGrpc.getStreamClientFruitTypeOrderRequestMethod = getStreamClientFruitTypeOrderRequestMethod =
              io.grpc.MethodDescriptor.<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest, org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamClientFruitTypeOrderRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FruitOrderServiceMethodDescriptorSupplier("streamClientFruitTypeOrderRequest"))
              .build();
        }
      }
    }
    return getStreamClientFruitTypeOrderRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FruitOrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FruitOrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FruitOrderServiceStub>() {
        @java.lang.Override
        public FruitOrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FruitOrderServiceStub(channel, callOptions);
        }
      };
    return FruitOrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FruitOrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FruitOrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FruitOrderServiceBlockingStub>() {
        @java.lang.Override
        public FruitOrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FruitOrderServiceBlockingStub(channel, callOptions);
        }
      };
    return FruitOrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FruitOrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FruitOrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FruitOrderServiceFutureStub>() {
        @java.lang.Override
        public FruitOrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FruitOrderServiceFutureStub(channel, callOptions);
        }
      };
    return FruitOrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Client streaming service rpc
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest> streamClientFruitTypeOrderRequest(
        io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamClientFruitTypeOrderRequestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FruitOrderService.
   */
  public static abstract class FruitOrderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FruitOrderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FruitOrderService.
   */
  public static final class FruitOrderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FruitOrderServiceStub> {
    private FruitOrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FruitOrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FruitOrderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client streaming service rpc
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest> streamClientFruitTypeOrderRequest(
        io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getStreamClientFruitTypeOrderRequestMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FruitOrderService.
   */
  public static final class FruitOrderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FruitOrderServiceBlockingStub> {
    private FruitOrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FruitOrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FruitOrderServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FruitOrderService.
   */
  public static final class FruitOrderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FruitOrderServiceFutureStub> {
    private FruitOrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FruitOrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FruitOrderServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_STREAM_CLIENT_FRUIT_TYPE_ORDER_REQUEST = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STREAM_CLIENT_FRUIT_TYPE_ORDER_REQUEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamClientFruitTypeOrderRequest(
              (io.grpc.stub.StreamObserver<org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getStreamClientFruitTypeOrderRequestMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderRequest,
              org.example.foodcontainer.foodstorageservice.StreamClientFruitTypeOrderResponse>(
                service, METHODID_STREAM_CLIENT_FRUIT_TYPE_ORDER_REQUEST)))
        .build();
  }

  private static abstract class FruitOrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FruitOrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.foodcontainer.foodstorageservice.FoodStorageServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FruitOrderService");
    }
  }

  private static final class FruitOrderServiceFileDescriptorSupplier
      extends FruitOrderServiceBaseDescriptorSupplier {
    FruitOrderServiceFileDescriptorSupplier() {}
  }

  private static final class FruitOrderServiceMethodDescriptorSupplier
      extends FruitOrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FruitOrderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (FruitOrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FruitOrderServiceFileDescriptorSupplier())
              .addMethod(getStreamClientFruitTypeOrderRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
