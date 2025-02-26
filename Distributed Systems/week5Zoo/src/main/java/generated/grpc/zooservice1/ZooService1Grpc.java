package generated.grpc.zooservice1;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: ZooService1.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ZooService1Grpc {

  private ZooService1Grpc() {}

  public static final String SERVICE_NAME = "ZooService1.ZooService1";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.grpc.zooservice1.Location,
      generated.grpc.zooservice1.Temperature> getMonitorTheTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MonitorTheTemperature",
      requestType = generated.grpc.zooservice1.Location.class,
      responseType = generated.grpc.zooservice1.Temperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.zooservice1.Location,
      generated.grpc.zooservice1.Temperature> getMonitorTheTemperatureMethod() {
    io.grpc.MethodDescriptor<generated.grpc.zooservice1.Location, generated.grpc.zooservice1.Temperature> getMonitorTheTemperatureMethod;
    if ((getMonitorTheTemperatureMethod = ZooService1Grpc.getMonitorTheTemperatureMethod) == null) {
      synchronized (ZooService1Grpc.class) {
        if ((getMonitorTheTemperatureMethod = ZooService1Grpc.getMonitorTheTemperatureMethod) == null) {
          ZooService1Grpc.getMonitorTheTemperatureMethod = getMonitorTheTemperatureMethod =
              io.grpc.MethodDescriptor.<generated.grpc.zooservice1.Location, generated.grpc.zooservice1.Temperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MonitorTheTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.zooservice1.Location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.zooservice1.Temperature.getDefaultInstance()))
              .setSchemaDescriptor(new ZooService1MethodDescriptorSupplier("MonitorTheTemperature"))
              .build();
        }
      }
    }
    return getMonitorTheTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.zooservice1.Location,
      generated.grpc.zooservice1.Temperature> getCurrentTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CurrentTemperature",
      requestType = generated.grpc.zooservice1.Location.class,
      responseType = generated.grpc.zooservice1.Temperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.grpc.zooservice1.Location,
      generated.grpc.zooservice1.Temperature> getCurrentTemperatureMethod() {
    io.grpc.MethodDescriptor<generated.grpc.zooservice1.Location, generated.grpc.zooservice1.Temperature> getCurrentTemperatureMethod;
    if ((getCurrentTemperatureMethod = ZooService1Grpc.getCurrentTemperatureMethod) == null) {
      synchronized (ZooService1Grpc.class) {
        if ((getCurrentTemperatureMethod = ZooService1Grpc.getCurrentTemperatureMethod) == null) {
          ZooService1Grpc.getCurrentTemperatureMethod = getCurrentTemperatureMethod =
              io.grpc.MethodDescriptor.<generated.grpc.zooservice1.Location, generated.grpc.zooservice1.Temperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CurrentTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.zooservice1.Location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.zooservice1.Temperature.getDefaultInstance()))
              .setSchemaDescriptor(new ZooService1MethodDescriptorSupplier("CurrentTemperature"))
              .build();
        }
      }
    }
    return getCurrentTemperatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.grpc.zooservice1.Temperature,
      generated.grpc.zooservice1.Temperature> getAverageTemperatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AverageTemperature",
      requestType = generated.grpc.zooservice1.Temperature.class,
      responseType = generated.grpc.zooservice1.Temperature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<generated.grpc.zooservice1.Temperature,
      generated.grpc.zooservice1.Temperature> getAverageTemperatureMethod() {
    io.grpc.MethodDescriptor<generated.grpc.zooservice1.Temperature, generated.grpc.zooservice1.Temperature> getAverageTemperatureMethod;
    if ((getAverageTemperatureMethod = ZooService1Grpc.getAverageTemperatureMethod) == null) {
      synchronized (ZooService1Grpc.class) {
        if ((getAverageTemperatureMethod = ZooService1Grpc.getAverageTemperatureMethod) == null) {
          ZooService1Grpc.getAverageTemperatureMethod = getAverageTemperatureMethod =
              io.grpc.MethodDescriptor.<generated.grpc.zooservice1.Temperature, generated.grpc.zooservice1.Temperature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AverageTemperature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.zooservice1.Temperature.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.grpc.zooservice1.Temperature.getDefaultInstance()))
              .setSchemaDescriptor(new ZooService1MethodDescriptorSupplier("AverageTemperature"))
              .build();
        }
      }
    }
    return getAverageTemperatureMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ZooService1Stub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZooService1Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZooService1Stub>() {
        @java.lang.Override
        public ZooService1Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZooService1Stub(channel, callOptions);
        }
      };
    return ZooService1Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ZooService1BlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZooService1BlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZooService1BlockingStub>() {
        @java.lang.Override
        public ZooService1BlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZooService1BlockingStub(channel, callOptions);
        }
      };
    return ZooService1BlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ZooService1FutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ZooService1FutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ZooService1FutureStub>() {
        @java.lang.Override
        public ZooService1FutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ZooService1FutureStub(channel, callOptions);
        }
      };
    return ZooService1FutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ZooService1ImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * for a specific location get a stream of updates about the current temperature
     * to populate a chart on a dashboard for example
     * </pre>
     */
    public void monitorTheTemperature(generated.grpc.zooservice1.Location request,
        io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMonitorTheTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     *for a specific location get the temperature right now
     * </pre>
     */
    public void currentTemperature(generated.grpc.zooservice1.Location request,
        io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCurrentTemperatureMethod(), responseObserver);
    }

    /**
     * <pre>
     *  get the average temperature  
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> averageTemperature(
        io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAverageTemperatureMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMonitorTheTemperatureMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                generated.grpc.zooservice1.Location,
                generated.grpc.zooservice1.Temperature>(
                  this, METHODID_MONITOR_THE_TEMPERATURE)))
          .addMethod(
            getCurrentTemperatureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                generated.grpc.zooservice1.Location,
                generated.grpc.zooservice1.Temperature>(
                  this, METHODID_CURRENT_TEMPERATURE)))
          .addMethod(
            getAverageTemperatureMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                generated.grpc.zooservice1.Temperature,
                generated.grpc.zooservice1.Temperature>(
                  this, METHODID_AVERAGE_TEMPERATURE)))
          .build();
    }
  }

  /**
   */
  public static final class ZooService1Stub extends io.grpc.stub.AbstractAsyncStub<ZooService1Stub> {
    private ZooService1Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZooService1Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZooService1Stub(channel, callOptions);
    }

    /**
     * <pre>
     * for a specific location get a stream of updates about the current temperature
     * to populate a chart on a dashboard for example
     * </pre>
     */
    public void monitorTheTemperature(generated.grpc.zooservice1.Location request,
        io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getMonitorTheTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *for a specific location get the temperature right now
     * </pre>
     */
    public void currentTemperature(generated.grpc.zooservice1.Location request,
        io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCurrentTemperatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  get the average temperature  
     * </pre>
     */
    public io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> averageTemperature(
        io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAverageTemperatureMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class ZooService1BlockingStub extends io.grpc.stub.AbstractBlockingStub<ZooService1BlockingStub> {
    private ZooService1BlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZooService1BlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZooService1BlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * for a specific location get a stream of updates about the current temperature
     * to populate a chart on a dashboard for example
     * </pre>
     */
    public java.util.Iterator<generated.grpc.zooservice1.Temperature> monitorTheTemperature(
        generated.grpc.zooservice1.Location request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getMonitorTheTemperatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *for a specific location get the temperature right now
     * </pre>
     */
    public generated.grpc.zooservice1.Temperature currentTemperature(generated.grpc.zooservice1.Location request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCurrentTemperatureMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ZooService1FutureStub extends io.grpc.stub.AbstractFutureStub<ZooService1FutureStub> {
    private ZooService1FutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ZooService1FutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ZooService1FutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *for a specific location get the temperature right now
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.grpc.zooservice1.Temperature> currentTemperature(
        generated.grpc.zooservice1.Location request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCurrentTemperatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MONITOR_THE_TEMPERATURE = 0;
  private static final int METHODID_CURRENT_TEMPERATURE = 1;
  private static final int METHODID_AVERAGE_TEMPERATURE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ZooService1ImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ZooService1ImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MONITOR_THE_TEMPERATURE:
          serviceImpl.monitorTheTemperature((generated.grpc.zooservice1.Location) request,
              (io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature>) responseObserver);
          break;
        case METHODID_CURRENT_TEMPERATURE:
          serviceImpl.currentTemperature((generated.grpc.zooservice1.Location) request,
              (io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature>) responseObserver);
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
        case METHODID_AVERAGE_TEMPERATURE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.averageTemperature(
              (io.grpc.stub.StreamObserver<generated.grpc.zooservice1.Temperature>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ZooService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ZooService1BaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.grpc.zooservice1.ZooService1Impl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ZooService1");
    }
  }

  private static final class ZooService1FileDescriptorSupplier
      extends ZooService1BaseDescriptorSupplier {
    ZooService1FileDescriptorSupplier() {}
  }

  private static final class ZooService1MethodDescriptorSupplier
      extends ZooService1BaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ZooService1MethodDescriptorSupplier(String methodName) {
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
      synchronized (ZooService1Grpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ZooService1FileDescriptorSupplier())
              .addMethod(getMonitorTheTemperatureMethod())
              .addMethod(getCurrentTemperatureMethod())
              .addMethod(getAverageTemperatureMethod())
              .build();
        }
      }
    }
    return result;
  }
}
