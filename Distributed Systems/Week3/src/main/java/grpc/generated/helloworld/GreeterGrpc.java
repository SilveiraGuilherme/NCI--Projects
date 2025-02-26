package grpc.generated.helloworld;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: HelloWorld.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GreeterGrpc {

  private GreeterGrpc() {}

  public static final String SERVICE_NAME = "helloworld.Greeter";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.generated.helloworld.HelloRequest,
      grpc.generated.helloworld.HelloReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = grpc.generated.helloworld.HelloRequest.class,
      responseType = grpc.generated.helloworld.HelloReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.generated.helloworld.HelloRequest,
      grpc.generated.helloworld.HelloReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<grpc.generated.helloworld.HelloRequest, grpc.generated.helloworld.HelloReply> getSayHelloMethod;
    if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayHelloMethod = GreeterGrpc.getSayHelloMethod) == null) {
          GreeterGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<grpc.generated.helloworld.HelloRequest, grpc.generated.helloworld.HelloReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.helloworld.HelloRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.helloworld.HelloReply.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.generated.helloworld.GoodbyeRequest,
      grpc.generated.helloworld.GoodbyeResponse> getSayGoodbyeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayGoodbye",
      requestType = grpc.generated.helloworld.GoodbyeRequest.class,
      responseType = grpc.generated.helloworld.GoodbyeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.generated.helloworld.GoodbyeRequest,
      grpc.generated.helloworld.GoodbyeResponse> getSayGoodbyeMethod() {
    io.grpc.MethodDescriptor<grpc.generated.helloworld.GoodbyeRequest, grpc.generated.helloworld.GoodbyeResponse> getSayGoodbyeMethod;
    if ((getSayGoodbyeMethod = GreeterGrpc.getSayGoodbyeMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getSayGoodbyeMethod = GreeterGrpc.getSayGoodbyeMethod) == null) {
          GreeterGrpc.getSayGoodbyeMethod = getSayGoodbyeMethod =
              io.grpc.MethodDescriptor.<grpc.generated.helloworld.GoodbyeRequest, grpc.generated.helloworld.GoodbyeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayGoodbye"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.helloworld.GoodbyeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.helloworld.GoodbyeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("SayGoodbye"))
              .build();
        }
      }
    }
    return getSayGoodbyeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.generated.helloworld.GoodbyeRequest,
      grpc.generated.helloworld.GoodbyeResponse> getLotsOfGoodByesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LotsOfGoodByes",
      requestType = grpc.generated.helloworld.GoodbyeRequest.class,
      responseType = grpc.generated.helloworld.GoodbyeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.generated.helloworld.GoodbyeRequest,
      grpc.generated.helloworld.GoodbyeResponse> getLotsOfGoodByesMethod() {
    io.grpc.MethodDescriptor<grpc.generated.helloworld.GoodbyeRequest, grpc.generated.helloworld.GoodbyeResponse> getLotsOfGoodByesMethod;
    if ((getLotsOfGoodByesMethod = GreeterGrpc.getLotsOfGoodByesMethod) == null) {
      synchronized (GreeterGrpc.class) {
        if ((getLotsOfGoodByesMethod = GreeterGrpc.getLotsOfGoodByesMethod) == null) {
          GreeterGrpc.getLotsOfGoodByesMethod = getLotsOfGoodByesMethod =
              io.grpc.MethodDescriptor.<grpc.generated.helloworld.GoodbyeRequest, grpc.generated.helloworld.GoodbyeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LotsOfGoodByes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.helloworld.GoodbyeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.generated.helloworld.GoodbyeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new GreeterMethodDescriptorSupplier("LotsOfGoodByes"))
              .build();
        }
      }
    }
    return getLotsOfGoodByesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GreeterStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterStub>() {
        @java.lang.Override
        public GreeterStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterStub(channel, callOptions);
        }
      };
    return GreeterStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GreeterBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterBlockingStub>() {
        @java.lang.Override
        public GreeterBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterBlockingStub(channel, callOptions);
        }
      };
    return GreeterBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GreeterFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GreeterFutureStub>() {
        @java.lang.Override
        public GreeterFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GreeterFutureStub(channel, callOptions);
        }
      };
    return GreeterFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class GreeterImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(grpc.generated.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * Says Goodbye
     * </pre>
     */
    public void sayGoodbye(grpc.generated.helloworld.GoodbyeRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.helloworld.GoodbyeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayGoodbyeMethod(), responseObserver);
    }

    /**
     * <pre>
     * Says lots of goodbyes
     * </pre>
     */
    public void lotsOfGoodByes(grpc.generated.helloworld.GoodbyeRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.helloworld.GoodbyeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLotsOfGoodByesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.generated.helloworld.HelloRequest,
                grpc.generated.helloworld.HelloReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayGoodbyeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.generated.helloworld.GoodbyeRequest,
                grpc.generated.helloworld.GoodbyeResponse>(
                  this, METHODID_SAY_GOODBYE)))
          .addMethod(
            getLotsOfGoodByesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                grpc.generated.helloworld.GoodbyeRequest,
                grpc.generated.helloworld.GoodbyeResponse>(
                  this, METHODID_LOTS_OF_GOOD_BYES)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterStub extends io.grpc.stub.AbstractAsyncStub<GreeterStub> {
    private GreeterStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(grpc.generated.helloworld.HelloRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.helloworld.HelloReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Says Goodbye
     * </pre>
     */
    public void sayGoodbye(grpc.generated.helloworld.GoodbyeRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.helloworld.GoodbyeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayGoodbyeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Says lots of goodbyes
     * </pre>
     */
    public void lotsOfGoodByes(grpc.generated.helloworld.GoodbyeRequest request,
        io.grpc.stub.StreamObserver<grpc.generated.helloworld.GoodbyeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getLotsOfGoodByesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterBlockingStub extends io.grpc.stub.AbstractBlockingStub<GreeterBlockingStub> {
    private GreeterBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public grpc.generated.helloworld.HelloReply sayHello(grpc.generated.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Says Goodbye
     * </pre>
     */
    public grpc.generated.helloworld.GoodbyeResponse sayGoodbye(grpc.generated.helloworld.GoodbyeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayGoodbyeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Says lots of goodbyes
     * </pre>
     */
    public java.util.Iterator<grpc.generated.helloworld.GoodbyeResponse> lotsOfGoodByes(
        grpc.generated.helloworld.GoodbyeRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getLotsOfGoodByesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class GreeterFutureStub extends io.grpc.stub.AbstractFutureStub<GreeterFutureStub> {
    private GreeterFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GreeterFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GreeterFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generated.helloworld.HelloReply> sayHello(
        grpc.generated.helloworld.HelloRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Says Goodbye
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.generated.helloworld.GoodbyeResponse> sayGoodbye(
        grpc.generated.helloworld.GoodbyeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayGoodbyeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_GOODBYE = 1;
  private static final int METHODID_LOTS_OF_GOOD_BYES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GreeterImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GreeterImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((grpc.generated.helloworld.HelloRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generated.helloworld.HelloReply>) responseObserver);
          break;
        case METHODID_SAY_GOODBYE:
          serviceImpl.sayGoodbye((grpc.generated.helloworld.GoodbyeRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generated.helloworld.GoodbyeResponse>) responseObserver);
          break;
        case METHODID_LOTS_OF_GOOD_BYES:
          serviceImpl.lotsOfGoodByes((grpc.generated.helloworld.GoodbyeRequest) request,
              (io.grpc.stub.StreamObserver<grpc.generated.helloworld.GoodbyeResponse>) responseObserver);
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

  private static abstract class GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GreeterBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.generated.helloworld.HelloWorldServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Greeter");
    }
  }

  private static final class GreeterFileDescriptorSupplier
      extends GreeterBaseDescriptorSupplier {
    GreeterFileDescriptorSupplier() {}
  }

  private static final class GreeterMethodDescriptorSupplier
      extends GreeterBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GreeterMethodDescriptorSupplier(String methodName) {
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
      synchronized (GreeterGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GreeterFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayGoodbyeMethod())
              .addMethod(getLotsOfGoodByesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
