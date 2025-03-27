import java.lang.Comparable;

public class Car implements Comparable<Car> {
    // variables
    private int id;
    private int year;
    private String make;
    private String model;
    private String colour;
    private int price;

    // constructor
    public Car(int id, int year, String make, String model, String colour, int price) {
        this.id = id;
        this.year = year;
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.price = price;
    }

    // methods
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Override

    @Override
    public int compareTo(Car obj) {
        return this.model.compareToIgnoreCase(obj.model);
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nYear: " + year + "\nMake: " + make + "\nModel: " + model + "\nColour: " + colour
                + "\nPrice: " + price + "\n";
    }
}
