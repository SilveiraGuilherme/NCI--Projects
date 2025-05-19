import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StaffReader {
    public static void main(String[] args) throws IOException {
        // Variables used to read and write object from and into a file
        String csvFile = "Staff.csv";
        String serializedFile = "Staff.dat";

        // Create an Array List to store objects created from CSV data
        Staff[] staffArray = new Staff[10000];

        BufferedReader br = null;

        try {
            // Open CSV file using BufferedReader
            br = new BufferedReader(new FileReader(csvFile));
            br.readLine(); // Skip the header line

            String line; // Store line
            int index = 0;

            // Read each line, convert to Staff object and add to list
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // Split the values within a line

                // Assign values to variables
                int empNo = Integer.parseInt(values[0].trim());
                String firstName = values[1].trim();
                String lastName = values[2].trim();
                String department = values[3].trim();
                double wage = Double.parseDouble(values[4].trim());
                double pCompRate = Double.parseDouble(values[5].trim());

                // Create Staff object and add to list
                Staff staff = new Staff(empNo, firstName, lastName, department, wage, pCompRate);
                staffArray[index++] = staff; // Add Staff object to the list
            }

            // Serialize the list of Staff objects to a file
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serializedFile));
            oos.writeObject(staffArray);
            oos.close();

            System.out.println("Staff members were serialized to " + serializedFile);
        } catch (IOException e) {
            // Handle any I/O exceptions
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Ensure the file reader is closed, even if an error occurs
            if (br != null) {
                br.close();
            }
        }
    }
}
