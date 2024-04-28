package org.example.foodcontainer.breadorderservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.1)",
    comments = "Source: BreadOrderService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BreadOrderServiceGrpc {

  private BreadOrderServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "org.example.FoodContainer.BreadOrderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest,
      org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse> getBreadOrderRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "breadOrderRequest",
      requestType = org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest.class,
      responseType = org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest,
      org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse> getBreadOrderRequestMethod() {
    io.grpc.MethodDescriptor<org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest, org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse> getBreadOrderRequestMethod;
    if ((getBreadOrderRequestMethod = BreadOrderServiceGrpc.getBreadOrderRequestMethod) == null) {
      synchronized (BreadOrderServiceGrpc.class) {
        if ((getBreadOrderRequestMethod = BreadOrderServiceGrpc.getBreadOrderRequestMethod) == null) {
          BreadOrderServiceGrpc.getBreadOrderRequestMethod = getBreadOrderRequestMethod =
              io.grpc.MethodDescriptor.<org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest, org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "breadOrderRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BreadOrderServiceMethodDescriptorSupplier("breadOrderRequest"))
              .build();
        }
      }
    }
    return getBreadOrderRequestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BreadOrderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BreadOrderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BreadOrderServiceStub>() {
        @java.lang.Override
        public BreadOrderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BreadOrderServiceStub(channel, callOptions);
        }
      };
    return BreadOrderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BreadOrderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BreadOrderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BreadOrderServiceBlockingStub>() {
        @java.lang.Override
        public BreadOrderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BreadOrderServiceBlockingStub(channel, callOptions);
        }
      };
    return BreadOrderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BreadOrderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BreadOrderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BreadOrderServiceFutureStub>() {
        @java.lang.Override
        public BreadOrderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BreadOrderServiceFutureStub(channel, callOptions);
        }
      };
    return BreadOrderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Client-side streaming RPC
     * </pre>
     */
    default io.grpc.stub.StreamObserver<org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest> breadOrderRequest(
        io.grpc.stub.StreamObserver<org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBreadOrderRequestMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BreadOrderService.
   */
  public static abstract class BreadOrderServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BreadOrderServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BreadOrderService.
   */
  public static final class BreadOrderServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BreadOrderServiceStub> {
    private BreadOrderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BreadOrderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BreadOrderServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client-side streaming RPC
     * </pre>
     */
    public io.grpc.stub.StreamObserver<org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest> breadOrderRequest(
        io.grpc.stub.StreamObserver<org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getBreadOrderRequestMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BreadOrderService.
   */
  public static final class BreadOrderServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BreadOrderServiceBlockingStub> {
    private BreadOrderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BreadOrderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BreadOrderServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BreadOrderService.
   */
  public static final class BreadOrderServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BreadOrderServiceFutureStub> {
    private BreadOrderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BreadOrderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BreadOrderServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_BREAD_ORDER_REQUEST = 0;

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
        case METHODID_BREAD_ORDER_REQUEST:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.breadOrderRequest(
              (io.grpc.stub.StreamObserver<org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getBreadOrderRequestMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              org.example.foodcontainer.breadorderservice.StreamBreadOrderRequest,
              org.example.foodcontainer.breadorderservice.StreamBreadOrderResponse>(
                service, METHODID_BREAD_ORDER_REQUEST)))
        .build();
  }

  private static abstract class BreadOrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BreadOrderServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.foodcontainer.breadorderservice.BreadOrderServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BreadOrderService");
    }
  }

  private static final class BreadOrderServiceFileDescriptorSupplier
      extends BreadOrderServiceBaseDescriptorSupplier {
    BreadOrderServiceFileDescriptorSupplier() {}
  }

  private static final class BreadOrderServiceMethodDescriptorSupplier
      extends BreadOrderServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BreadOrderServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BreadOrderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BreadOrderServiceFileDescriptorSupplier())
              .addMethod(getBreadOrderRequestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
