/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.hotelbooking;

import java.io.Serializable;

/**
 *
 * @author guilhermesilveira
 */
public class HolidayBooking implements Serializable {
    private static final long serialVersionUID = 1L;
    
    String guestName;
    String hotelName;
    
    public HolidayBooking(){
        guestName = "Somebody";
        hotelName = "Some hotel";
    }
    
    public void setGuest(String gName) {
        guestName = gName;
    }
    
    public String getGuest() {
        return guestName;
    }
        
    public void setHotel(String hName) {
        hotelName = hName;
    }
    
    public String gethotel() {
        return hotelName;
    }
    
    public String getBooking() {
        return "The hotel " + hotelName + " is booked for " + guestName;
    }
}
