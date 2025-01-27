/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.helloworld;

import distsys.helloworld.Hello;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

	public HelloImpl() throws RemoteException { 
	
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
	
   public static void main (String args[]) {
	   try {
		    // make a new instance of the server object
                    HelloImpl hiServiceObj = new HelloImpl();
                    // create a new RMI registry on port 1099
                     Registry registry = LocateRegistry.createRegistry(1099);//1099 is the port number
                     // bind the server object to the name of the service "HelloServer";
                     registry.rebind("HelloServer", hiServiceObj );
                     // print a message that the server is ready
		    System.out.println("Server: " + "HelloServer"  + " is ready");
	   }
	   catch (Exception e) {
                   // print out the message if there is an error
		   System.out.println("HelloImpl err: " + e.getMessage());
		   e.printStackTrace();
	   }
   }
	
	
}