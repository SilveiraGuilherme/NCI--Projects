/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.fibonacci;
import distsys.fibonacci.Fibonacci;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class FibonacciImpl extends UnicastRemoteObject implements Fibonacci {

	public FibonacciImpl() throws RemoteException { 
	
	}
	/**
         * This is the service method that gets called by the client.
         * @return 
         */
	public String sayHello () {
            
		return "Hello Impl says HelloWorld!";
	}
        
        public String sayGoodBye () {
            return "Hello Impl says GoodBye!";
        }
	
   public static void main (String args[] ) {
	   try {
		    // make a new instance of the server object
                    FibonacciImpl fibServiceObj = new FibonacciImpl();
                    // create a new RMI registry on port 1099
                     Registry registry = LocateRegistry.createRegistry(1099);//1099 is the port number
                     // bind the server object to the name of the service "FibonacciServer";
                     registry.rebind("FibonacciServer",fibServiceObj );
                     // print a message that the server is ready
		    System.out.println("Server: " + "FibonacciServer"  + " is ready");
	   }
	   catch (Exception e) {
                   // print out the message if there is an error
		   System.out.println("FibonacciImpl err: " + e.getMessage());
		   e.printStackTrace();
	   }
   }
	
	
}