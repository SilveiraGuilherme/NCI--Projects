public class Person {
    // variables
    private String name;
    private int age;

    // constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString method for easy printing of the person's name and age
    // It is a good practice to add "@Override" to the code every time we are
    // overriding a preexistent method to let the system know that the method has
    // been overridden

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
