import java.io.Serializable;

//The class implements Serializable, so it can be saved into a file
public class Staff implements Serializable {
    // Variables
    private int empNo;
    private String firstName;
    private String lastName;
    private String department;
    private double wage;
    private double pCompRate;

    // Constructor
    public Staff(int empNo, String firstName, String lastName, String department, double wage, double pCompRate) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.wage = wage;
        this.pCompRate = pCompRate;
    }

    // Getters and Setters
    public int getEmpNo() {
        return empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public double getWage() {
        return wage;
    }

    public double getPCompRate() {
        return pCompRate;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setPCompRate(double pCompRate) {
        this.pCompRate = pCompRate;
    }

    // Override toString Method
    @Override
    public String toString() {
        return "Employee: #" + empNo + " - " + firstName + " " + lastName + "\nDepartment: " + department
                + "\nWage: "
                + wage + "\nProject Completion Rate: " + pCompRate + "\n";
    }
}