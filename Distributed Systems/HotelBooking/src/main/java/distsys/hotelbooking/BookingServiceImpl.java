/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.hotelbooking;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author guilhermesilveira
 */
public class BookingServiceImpl extends UnicastRemoteObject implements BookingService{
    
    public BookingServiceImpl() throws RemoteException {
        System.out.println("Server : " + "BookingServer" + " is started...");

    }

    public static void main(String args[]) {
        String service = "BookingServer";
        int port = 1099;
        String host = "localhost"; //any location

        String bindLocation = "rmi://" + host + ":" + port + "/" + service;
        startRegistry(port);
        // register the server name with the naming service
        try {
            BookingServiceImpl bookHolidaysObj = new BookingServiceImpl();
            // Bind this object instance to the name "BookingServer"
            Naming.rebind("BookingServer", bookHolidaysObj);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void startRegistry(int port) {
        try {
            LocateRegistry.createRegistry(port);
            System.out.println("RMI registry is ready ...");

        } catch (Exception e) {
            System.out.println("Exception starting RMI Registry " + e.getMessage());
            e.printStackTrace();
        }

    }
    
    @Override
    public HolidayBooking bookHotel(Person guest, String hotelName) throws RemoteException {
        HolidayBooking hb = new HolidayBooking();
        hb.setGuest(guest.getName());
        hb.setHotel(hotelName);        
        return hb;
    }
}