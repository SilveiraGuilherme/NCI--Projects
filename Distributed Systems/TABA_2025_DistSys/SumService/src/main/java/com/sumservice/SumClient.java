package com.sumservice;

/**
 *
 * @author guilhermesilveira
 */

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Arrays;
import java.util.List;

public class SumClient {
    public static void main(String[] args){
        // Open a channel to the server
        // ManagedChannelBuilder connects client to gRPC server
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051)
                .usePlaintext() // disables TLS
                .build();
        
        // Create a stub from the generated gRPC class
        SumServiceGrpc.SumServiceBlockingStub stub = SumServiceGrpc.newBlockingStub(channel);
        
        // Prepare a list of numbers to sum
        List<Integer> numbers = Arrays.asList(3, 5, 7, 10);
        
        // Create a request
        SumRequest request = SumRequest.newBuilder()
                .addAllNumbers(numbers)
                .build();
        
        // Send request and receive response
        SumResponse response = stub.sumArray(request);
        
        // Print result
        System.out.println("Sum of numbers: " + response.getResult());
        
        // Shutdown channel
        channel.shutdown();
    }
}

