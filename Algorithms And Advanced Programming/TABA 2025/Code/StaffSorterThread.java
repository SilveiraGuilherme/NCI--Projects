import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class StaffSorterThread extends Thread {
    // Variables
    private Staff[] data;
    private int column;

    // Constructor
    public StaffSorterThread(Staff[] original, int column) {
        // Copy the original array into data
        this.data = new Staff[original.length];
        for (int i = 0; i < original.length; i++) {
            this.data[i] = original[i];
        }
        this.column = column;
    }

    @Override
    public void run() {
        // Sort using mergeSort
        StaffSorter.mergeSort(data, 0, data.length, column);

        // Save the sorted array to sortedStaff_C{column}.csv
        String filename = "sortedStaff_C" + column + ".csv";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            // Write header
            writer.write("empNo,firstName,lastName,department,wage,pCompRate");
            writer.newLine();

            // Write each staff row
            for (Staff staff : data) {
                String line = staff.toString();
                writer.write(line);
                writer.newLine();
            }

            System.out.println("Finished writing " + filename);

        } catch (IOException e) {
            System.out.println("Error writing to " + filename + ": " + e.getMessage());
        }
    }
}
