import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StaffDeserializer {
    public static void main(String[] args) {
        String serializedFile = "Staff.ser";

        try {
            // Read serialized file
            // Open file and create an object input stream to read objects
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedFile));

            // Read the array of staff objects from the file and cast it
            Staff[] staffArray = (Staff[]) ois.readObject();
            ois.close();

            // Recursively print each Staff object in the array
            System.out.println("Deserialized Staff Members:");
            printStaff(staffArray, 0);
        } catch (IOException | ClassNotFoundException e) {
            // Handle exceptions related to file I/O and class casting
            System.out.println("Error during deserialization: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Recursive method to print the array
    public static void printStaff(Staff[] array, int index) {
        if (index >= array.length) {
            return; // Base Case: Stop when it reaches the end
        }

        System.out.println(array[index]); // Print current staff
        printStaff(array, index + 1); // Recursive call with next index to print the next Staff object
    }
}
