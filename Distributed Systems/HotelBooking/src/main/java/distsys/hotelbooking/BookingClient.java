/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.hotelbooking;

import java.rmi.Naming;

/**
 *
 * @author guilhermesilveira
 */
public class BookingClient {
    public static void main(String[] args) {
        String remoteHost = "localhost";
        String remoteService = "BookingServer";

        try {
            BookingService bookingServer = (BookingService) Naming.lookup("//" + remoteHost + "/" + remoteService);
            
            Person person = new Person();
            person.setName("Triona");
            HolidayBooking theBooking = bookingServer.bookHotel(person, "The Gresham Hotel");
            System.out.println("Confirmation: " + theBooking.getBooking());
            
            Person person2 = new Person();
            person2.setName("George");
            HolidayBooking theBooking2 = bookingServer.bookHotel(person2, "Washington Hotel");
            System.out.println("Confirmation: " + theBooking2.getBooking());
            
            Person person3 = new Person();
            person3.setName("Guilherme");
            HolidayBooking theBooking3 = bookingServer.bookHotel(person3, "Phoenix Park Hotel");
            System.out.println("Confirmation: " + theBooking3.getBooking());

        } catch (Exception e) {
            System.out.println("Client Booking Error : " + e.getMessage());
            e.printStackTrace();

        }
    }
}
