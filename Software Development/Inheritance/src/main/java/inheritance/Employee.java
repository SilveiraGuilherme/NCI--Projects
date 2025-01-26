package inheritance;

/**
 *
 * @author guilhermesilveira
 */
public class Employee {
    // Variables
    private String name;
    private int age;
    private double mSal, ySal;
    
    // Constructor

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(double mSal, double ySal) {
        this.mSal = mSal;
        this.ySal = ySal;
    }

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getmSal() {
        return mSal;
    }

    public void setmSal(double mSal) {
        this.mSal = mSal;
    }

    public double getySal() {
        return ySal;
    }

    public void setySal(double ySal) {
        this.ySal = ySal;
    }
    
}
