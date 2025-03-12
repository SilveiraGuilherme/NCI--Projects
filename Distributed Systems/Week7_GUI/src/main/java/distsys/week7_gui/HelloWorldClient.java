package distsys.week7_gui;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import grpc.generated.helloworld.GreeterGrpc.GreeterBlockingStub;
import grpc.generated.helloworld.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class HelloWorldClient {

    private static final Logger logger = Logger.getLogger(HelloWorldClient.class.getName());
    GreeterBlockingStub blockingStub;
    ManagedChannel channel;
   
    public HelloWorldClient (){
        String host = "localhost";
        int port = 50051;
        channel = ManagedChannelBuilder.
                forAddress(host, port)
                .usePlaintext()
                .build();
         blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    public static void main(String[] args) throws Exception {
        
        HelloWorldClient helloWorldClient = new HelloWorldClient();
        try {
            HelloReply response = helloWorldClient.clientHelperSayHello("Paul");
            logger.info("Greeting: " + response.getMessage());
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
    }
    /**
     * The GUI class can call this method to invoke the service
     * @param theName
     * @return 
     */
    public HelloReply clientHelperSayHello(String theName) {
             
            HelloRequest request = HelloRequest.newBuilder().setName(theName).build();
            HelloReply response = blockingStub.sayHello(request);
            return response;
    }
}
