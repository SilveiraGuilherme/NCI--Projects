package com.sumservice;

/**
 *
 * @author guilhermesilveira
 */

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

public class SumServer {
    public static void main(String [] args) throws IOException, InterruptedException {
        // Create and start the server on port 50051
        Server server = ServerBuilder.forPort(50051) // Starts gRPC server on port 50051
                .addService(new SumServiceImpl()) // links the generated stub class to implemented logic
                .build();
        
        System.out.println("Server started on port 50051");
        server.start();
        server.awaitTermination(); // keep the server running
    }
    
    // Inner class to handle the service
    static class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {
        @Override //Overrides sumArray() method generated from the proto file
        public void sumArray(SumRequest request, StreamObserver<SumResponse> responseObserver) {
            int sum = 0;
            
            // Sum all number from the request
            for (int number : request.getNumbersList()) {
                sum += number;
            }
            
            // Create the response
            SumResponse response = SumResponse.newBuilder().setResult(sum).build();
            
            // Send the response
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}

