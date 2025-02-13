package distsys.week3;

import java.util.*;
import java.io.IOException;
import java.util.logging.Logger;

import grpc.generated.helloworld.GreeterGrpc.GreeterImplBase;
import grpc.generated.helloworld.*;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class HelloWorldServer extends GreeterImplBase {

	private static final Logger logger = Logger.getLogger(HelloWorldServer.class.getName());

	public static void main(String[] args) {
		
		HelloWorldServer greeterserver = new HelloWorldServer();
		
		int port = 50051;
	    
		try {
			Server server = ServerBuilder.forPort(port)
			    .addService(greeterserver)
			    .build()
			    .start();
			 logger.info("Server started, listening on " + port);
	         System.out.println(" Server started, listening on" + port);		   
			 server.awaitTermination();

			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
	   
	}
	
	@Override
	public void sayHello(HelloRequest request1,  StreamObserver<HelloReply> responseObserver) {
		    
		System.out.println("receiving hello request");
		
		 HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + request1.getName()).build();
	     
		 responseObserver.onNext(reply);
	     
	     responseObserver.onCompleted();
	}
        
        @Override
	public void sayGoodbye(GoodbyeRequest request2,  StreamObserver<GoodbyeResponse> responseObserver) {
		    
		System.out.println("receiving goodbye request");
                                
                GoodbyeResponse response = GoodbyeResponse.newBuilder().setMessage("Goodbye " + request2.getName()).setNumChar((("Goodbye " + request2.getName()).toString()).length()).build();
                
		responseObserver.onNext(response);
	     
	     responseObserver.onCompleted();
	}
	

}
