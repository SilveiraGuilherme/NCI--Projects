import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StaffThreadSorter {
    public static void main(String[] args) {
        String serializedFile = "Staff.dat";

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedFile));
            Staff[] staffArray = (Staff[]) ois.readObject();
            ois.close();

            // Create and start threads
            StaffSorterThread[] threads = new StaffSorterThread[6];

            for (int col = 1; col <= 6; col++) {
                threads[col - 1] = new StaffSorterThread(staffArray, col);
                threads[col - 1].start();
            }

            // Wait for all threads to finish
            for (StaffSorterThread thread : threads) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    System.out.println("Thread interrupted: " + e.getMessage());
                }
            }

            System.out.println("All sorting threads have completed.");

        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
