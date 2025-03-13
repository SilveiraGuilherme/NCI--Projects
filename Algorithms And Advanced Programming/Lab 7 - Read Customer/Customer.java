import java.util.*;

public class Customer {
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
    public String toString() {
        return "==========================================================================================\nName:\t"
                + this.name + "\nDate of Birth:\t" + this.DOB + "\nAddress:\t" + this.address;
    }
}
