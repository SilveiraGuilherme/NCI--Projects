package distsys.week3;

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

		  
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		GreeterBlockingStub  blockingStub = GreeterGrpc.newBlockingStub(channel);
	    
	    try {
	    	 String name = "Gui"; // this is the value that will be sent on the request to the server
	    	 HelloRequest request = HelloRequest.newBuilder().setName(name).build();
	    	 
	    	 HelloReply response = blockingStub.sayHello(request);
	    	 
	    	 logger.info("Greeting: " + response.getMessage());
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	
}
