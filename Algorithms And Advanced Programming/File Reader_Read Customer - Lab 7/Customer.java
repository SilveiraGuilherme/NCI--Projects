import java.util.*;
import java.lang.Comparable;

public class Customer implements Comparable<Customer> {
    // variables
    private String name;
    private Date DOB;
    private String address;

    // constructor
    public Customer(String name, Date DOB, String address) {
        this.name = name;
        this.DOB = DOB;
        this.address = address;
    }

    // setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int compareTo(Customer o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public String toString() {
        String formattedDOB = (DOB != null)
                ? new java.text.SimpleDateFormat("dd/MM/yyyy").format(DOB)
                : "Unknown";

        return "==========================================================================================\nName: \t\t"
                + this.name + "\nDate of Birth:\t" + formattedDOB + "\nAddress:\t" + this.address;
    }
}
