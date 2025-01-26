import java.util.*; //imports all classes belonging to java.util
//import java.util.ArrayList; - imports ArrayList class to be able to create ArrayLists
//import java.util.Collections; - imports Collections class to be able to use methods such as Collections.sort(arrList)

public class Test {
    public static void print(ArrayList<String> arr) {
        for (String current : arr) {
            System.out.println(current);
        }
    }

    public static void printPerson(ArrayList<Person> arr) {
        for (Person current : arr) {
            System.out.println(current);
        }
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello"); // add method to add items to an array
        list.add("World");
        list.add("bye");

        list.add("Gui"); // add a string to the list

        // try to add an integer to the list
        // list.add(2);
        // error: "The method add(int, String) in the type List<String> is not
        // applicable for the arguments (int)"

        list.remove(0); // remove an item at index 0

        list.add(1, "Added item"); // adds an item at the chosen index (1)

        list.remove("World"); // removes the first occurence of an object of the ArrayList

        list.set(2, "Guilherme"); // set method edits an object that exists in an ArrayList

        list.contains("bye"); // method contains() checks if an object exists in an ArrayList and
                              // returns true or false

        ArrayList<String> newList = new ArrayList<String>();

        newList.add("Good");
        newList.add("Morning");
        newList.add("Afternoon");
        newList.add("Evening");
        newList.add("Night");

        list.addAll(newList); // adds a collection of items to the list

        newList.clear(); // removes all the items of an ArrayList

        // create new instances of the instantiable class Person
        Person person1 = new Person("John", 25);
        Person person2 = new Person("Anna", 30);
        Person person3 = new Person("Mark", 40);

        // creste a ArrayList to store each person object
        ArrayList<Person> peopleList = new ArrayList<Person>();

        // add each person object to the ArrayList
        peopleList.add(person1);
        peopleList.add(person2);
        peopleList.add(person3);

        peopleList.set(0, new Person("Johnny", 28)); // replace object at index 0 with another one

        Test.printPerson(peopleList);

        Test.print(list);

        // normal for loop
        /*
         * for (int i = 0; i < list.size(); i++) {
         * System.out.println(list.get(i));
         * }
         */

    }
}