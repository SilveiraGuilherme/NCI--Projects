/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.hotelbooking;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author guilhermesilveira
 */
public interface BookingService extends Remote{
    public HolidayBooking bookHotel (Person guest, String hotelName) throws RemoteException;
}
