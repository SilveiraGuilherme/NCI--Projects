/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.week8_jmdnsexample1;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * This class uses a simple HttpClient to send a get request to the url that is
 * provide as input. The servers response to the GET request is printed to
 * System.out
 *
 * @author trion
 */
public class HttpClientExample {
   /**
    * 
    * @param url  - location of the service
    */
    public static void request(String url) {
        try {
            
            // make a new client and configure a HTTP GET request on the url that was passed in
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
            
            // send the request to the httpclient and get the response
            HttpResponse response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + response.statusCode());
            }
            // print out the body of the response
            System.out.println("Output from Server .... \n" + response.body());

        } catch (Exception e) {

            e.printStackTrace();

        }
    }

}
