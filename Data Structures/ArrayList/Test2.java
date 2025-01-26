import java.util.*; //import the package java.util

public class Test2 {
    public static void print(ArrayList<Integer> arr) {
        for (Integer current : arr) {
            System.out.println(current);
        }
    }

    public static void main(String[] args) {
        // declare an ArrayList called myInts that has an inital capacity of 25 elements
        ArrayList<Integer> myInts = new ArrayList<Integer>(25);

        // create a loop that adds the first 10 elements of the array which are
        // multiples of 3.
        for (int i = 0; i < 10; i++) {
            // the method add(index, element) is going to add the elements
            myInts.add(i, 3 * (i + 1));
        }

        // for each loop that cycles through all the elements of a collection, belonging
        // to the Collections API, such as an ArrayLoop
        for (Integer i : myInts) {
            System.out.println(i);
        }

        // set the sixth element to 44
        myInts.set(5, 44);

        // the method size() returns the number of elements that the ArrayList contains
        int arraySize = myInts.size();

        System.out.println("The size of the ArrayList is " + arraySize);

        System.out.println("The final array is " + myInts);

        // Test2.print(myInts);
    }
}
