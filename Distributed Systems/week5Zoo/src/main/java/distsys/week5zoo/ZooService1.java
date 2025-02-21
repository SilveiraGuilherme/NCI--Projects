/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week5zoo;

import generated.grpc.zooservice1.Temperature;
import generated.grpc.zooservice1.ZooService1Grpc;
import generated.grpc.zooservice1.ZooService1Grpc.ZooService1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author trion
 */
public class ZooService1 extends ZooService1ImplBase{
    
    private static final Logger logger = Logger.getLogger(ZooService1.class.getName());
     public static void main(String[] args) {

        ZooService1 zooServer = new ZooService1();

        int port = 50051;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(zooServer)
                    .build()
                    .start();
            logger.info("Server started, listening on " + port);
            System.out.println("***** Server started, listening on" + port);
            server.awaitTermination();

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
     
     /**
      * CLIENT STREAMING
      * get the average temperature  
      * rpc AverageTemperature(stream Temperature) returns (Temperature) {}
      * @param responseObserver - response to the client is return via this object
      * @return 
      */
     public StreamObserver<Temperature> averageTemperature ( StreamObserver<Temperature> responseObserver  ) {
                // server gets ready to gather multiple requests from the client. 
                // server sets up a new observer that can gather each client request when it sees onNext() and 
		// calculate the average once it sees onCompleted()
                // The server returns this observer back to the client and so the client can
                // make calls on it
                // This is an anonymous class (it has no variable name). If it had a name we would call it
                // requestOberver.
		// 
		return new StreamObserver<Temperature>() {

			// the observer will collect each number that arrives from the client into this ArrayList
			ArrayList<Double> list = new ArrayList();

			@Override
			// when a new number arrives , put it into the array
			public void onNext(Temperature request) {

				System.out.println(LocalTime.now().toString()+ ": received a NumberMessage: "+ request.getTempValue()  );
				list.add(request.getTempValue());		           
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
			}

			@Override
			// when there are no more messages coming from the client(the client calls onCompleted() on the message stream),
			// calculate the average, 
			// create the response and send to the client via responseObserver.onNext()
			// as the server is only going to send one response, it also does responseObserver.onCompleted() 

			public void onCompleted() {
				System.out.printf(LocalTime.now().toString() + ": NumberMessage stream complete \n" );

				double temp = 0;	
				for(double v:  list) {
					temp = temp + v;
				}
				double mean = temp/list.size();
                                
				Temperature reply = Temperature.newBuilder().setTempValue(mean).build();

				System.out.println("Server calculated average: "+ mean);
                                // the server calls onNext one time only on the response observer
                                // calling onNext() more than once will result in a runtime error
                                // the gRPC infrastructure know that in client streaming the server must send only
                                // one reply
				responseObserver.onNext(reply);
                                
                                // the server signals that it is finished
				responseObserver.onCompleted();
			}
		};
             }    
}
