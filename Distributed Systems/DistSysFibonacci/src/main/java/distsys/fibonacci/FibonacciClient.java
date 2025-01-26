/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.fibonacci;

import java.rmi.*;

public class FibonacciClient {

	public static void main(String[] args) {
		
		try {
			 
			// set up the servername. Print it out for testing purposes
                        // we are assuming that the server is on the local machine
			String serverName = "//localhost/FibonacciServer";
			System.out.println("Client will look up server named: " + serverName);
			
			//get a stub object for the server by looking it up by name
			Fibonacci obj = (Fibonacci)Naming.lookup(serverName);
			
			// invoke the method on the remote object and print it out.
			System.out.println(obj.sayHello());
                        System.out.println(obj.sayGoodBye());
	
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
