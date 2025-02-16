package distsys.week3;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import grpc.generated.helloworld.GreeterGrpc.GreeterBlockingStub;
import grpc.generated.helloworld.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class LotsOfGoodByesClient {

	private static final Logger logger = Logger.getLogger(LotsOfGoodByesClient.class.getName());
		  
	public static void main(String[] args) throws Exception {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.
				forAddress(host, port)
				.usePlaintext()
				.build();
		
		GreeterBlockingStub blockingStub = GreeterGrpc.newBlockingStub(channel);
	    
	    try {
	    	 String name = "Gui"; // this is the value that will be sent on the request to the server              
                 GoodbyeRequest request = GoodbyeRequest.newBuilder().setName(name).build();
	    	 GoodbyeResponse response = blockingStub.sayGoodbye(request);
                 
	    	 logger.info("Greeting: " + response.getMessage());
                 //logger.info("Greeting: " + response.getMessage() + "\nThis message has " + response2.getNumChar() + " characters.");
	    	 
	    } catch (StatusRuntimeException e) {
		    logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
		    return;		
		    
	    } finally {
	    	//shutdown channel
	    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	    }
	  }
	
	
}
