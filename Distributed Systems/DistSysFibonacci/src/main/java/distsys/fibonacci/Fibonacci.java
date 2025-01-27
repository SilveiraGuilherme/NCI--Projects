/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.fibonacci;
 
import java.rmi.*;
// import java.rmi.RemoteException;

/**
 * This is an interface definition. It defines the interface for the Hello service that can be used
 * by a client. The service inherits from java.rmi.Remote which enables its methods to be called remotely
 * @author trion
 */
public interface Fibonacci extends java.rmi.Remote {
	/**
         * This is the signature for the service method that can be called by the client
         * @return The return value is a String. The value of the string is set when this method
         * is implemented.
         * @throws RemoteException 
         */
	public int fibNum(int num) throws RemoteException;
}