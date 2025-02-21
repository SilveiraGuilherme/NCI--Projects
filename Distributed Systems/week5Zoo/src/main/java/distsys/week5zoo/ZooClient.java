/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week5zoo;

import generated.grpc.zooservice1.Temperature;
import generated.grpc.zooservice1.ZooService1Grpc;
import generated.grpc.zooservice1.ZooService1Grpc.ZooService1Stub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.time.LocalTime;

/**
 *
 * @author trion
 */
public class ZooClient {
    // a non-blocking stub to make an asynchronous call
    //
    private static  ZooService1Stub asyncStub;
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress("localhost", 50051)
				.usePlaintext()
				.build();
		
		//non-blocking stub is for asynchronous calls
		//client does not wait for server to complete before starting to read responses
		//must use non-blocking stub for client streaming and bidirectional streaming
		//can also use for Server Streaming asynchronously 
		asyncStub = ZooService1Grpc.newStub(channel);
                 
                requestAverageTemperature();		
       }
        
         /*
	 * CLIENT STREAMING 
	 * client sends a stream of numbers and when its done the
	 * server sends a response which is the average of all 
	 * the numbers.
	 *   
         * Client will call the AverageTemperature service method on the server
         * rpc AverageTemperature(stream Temperature) returns (Temperature) {}
	 */
       private static void requestAverageTemperature() {
                
		// set up the responseObserver - this is a new object where the client specifies the
		// behaviour to be performed for onNext() , onCompleted() and onError() 
		// the responseObserver is passed to the server when the interaction is initiated.
		// The server calls onNext() on the response observer when it responds 
		// and onComplete() when its finished responding 
		// 
		// The client is able to observe these events via the responseObserver.
	
		StreamObserver<Temperature> responseObserver = new StreamObserver<Temperature>() {

			@Override
                        /**
                         * NOTE that in client streaming we expect only one response from the server.So we should see
                         * this message only once. We could add some error handling in here to prevent the client from processing
                         * more than one reply from the server
                         */
			public void onNext(Temperature response) {
				System.out.println(LocalTime.now().toString() + ": response from server " + response.getTempValue() );
			}

			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}

			@Override
			public void onCompleted() {
				System.out.println(LocalTime.now().toString() + ": stream is completed.");
			}

		};

                // client opens the interaction using the asynchronous stub 
		// the client passes in its responseObserver and gets back a requestObserver 
		// the client sends requests using onNext() method on the requestObserver 
		// 
		StreamObserver<Temperature> requestObserver = asyncStub.averageTemperature(responseObserver);
		try {
			requestObserver.onNext(Temperature.newBuilder().setTempValue(12 ).build());
			// here the client sleeps for a bit between each request to slow things down so we can see
			// whats happening
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(16).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(15).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(14).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(14).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(18 ).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(19 ).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(21).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(21).build());
			Thread.sleep(500);

			requestObserver.onNext(Temperature.newBuilder().setTempValue(19).build());
			Thread.sleep(500);

			// tell the server that there are no more requests 
			requestObserver.onCompleted();

			// if the client sleeps now then it will see the server response when it wakes
			Thread.sleep(10000);
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
	}
}