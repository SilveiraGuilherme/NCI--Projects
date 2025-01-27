/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.fibonacci;

import java.rmi.*;

public class FibonacciClient {

	public static void main(String[] args) {
            String hostName = "localhost";
            int n = 10;
		
            if (args.length > 0){
		hostName = args[0];
		n = Integer.parseInt(args[1]);
            }
		
		try {
                    System.setProperty("java.rmi.server.hostanme", hostName);
			 
			
			//get a stub object for the server by looking it up by name
			Fibonacci obj = (Fibonacci)Naming.lookup("//" + hostName + "/FibonacciServer");
			
			// invoke the method on the remote object and print it out.
			System.out.println(obj.fibNum(n));
	
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
