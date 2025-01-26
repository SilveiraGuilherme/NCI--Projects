
// Java program to demonstrate the
// working of a List with ArrayList
// class

// Importing all utility classes 
import java.util.*;

// Main class
public class TestList {

    // Main driver method
    public static void main(String[] args) {
        // Creating an object of List class
        // Declaring an object of String type with
        // reference to ArrayList class
        // Type safe list
        List<String> al = new ArrayList<String>();

        // Adding elements using add() method
        // Custom input elements
        al.add("Geeks");
        al.add("for");
        al.add("Geeks");

        // Print and display the elements in
        // ArrayList class object
        System.out.println(al);

        al.add(1, "Hi");

        System.out.println(al);
    }
}
