import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

public class StaffSorter {
    public static void main(String[] args) {
        String serializedFile = "Staff.dat";

        try {
            // Deserialize the list
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serializedFile));
            Staff[] staffArray = (Staff[]) ois.readObject();
            ois.close();

            // Ask user for sorting preference
            String input = JOptionPane.showInputDialog(
                    "Sort by:\n\n1 - Employee Number\n2 - First Name\n3 - Last Name\n4 - Department\n5 - Wage\n6 - Project Completion Rate");
            int choice = Integer.parseInt(input);

            // Sort based on user's choice
            mergeSort(staffArray, 0, staffArray.length, choice);

            // Print sorted list
            for (Staff staff : staffArray) {
                System.out.println(staff);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void mergeSort(Staff[] array, int lowerB, int upperB, int column) {
        // Making sure that there is at least two elements in the list
        if (lowerB + 1 < upperB) {
            // Spliting the list by two and finding the middle element
            int mid = (lowerB + upperB) / 2;
            // Sorting the left side of the list recursively
            mergeSort(array, lowerB, mid, column);
            // Sorting the right side of the list recursively
            mergeSort(array, mid, upperB, column);
            // Merging both sides
            merge(array, lowerB, mid, upperB, column);
        }
    }

    public static void merge(Staff[] array, int lowerB, int mid, int upperB, int column) {
        // Initializing two pointers to the lowest index of each side (left and right)
        int i = lowerB, j = mid;
        // Creating a temporary list that will store the sorted values
        Staff[] temp = new Staff[upperB - lowerB];
        int k = 0;

        // Merging the two halves while comparing using compareStaff()
        // This loop will stop when one of the sides is fully merged
        while (i < mid && j < upperB) {
            if (compareStaff(array[i], array[j], column) <= 0) {
                temp[k] = array[i];
                i++;
            } else {
                temp[k] = array[j];
                j++;
            }
            k++;
        }

        // If there are leftover elements, which are already sorted, in one of the
        // halves, we need to copy them into the temp ArrayList
        // Checking leftover elements in the left side and adding them to temp
        while (i < mid) {
            temp[k] = array[i];
            i++;
            k++;
        }
        // Checking leftover elements in the right side and adding them to temp
        while (j < upperB) {
            temp[k] = array[j];
            j++;
            k++;
        }

        // We need to copy the elements from temp[] back to the original array in the
        // correct range
        // This will put the elements in the right order into the original list
        for (int t = 0; t < temp.length; t++) {
            array[lowerB + t] = temp[t];
        }
    }

    private static int compareStaff(Staff a, Staff b, int column) {
        switch (column) {
            case 1:
                return Integer.compare(a.getEmpNo(), b.getEmpNo());
            case 2:
                return a.getFirstName().compareToIgnoreCase(b.getFirstName());
            case 3:
                return a.getLastName().compareToIgnoreCase(b.getLastName());
            case 4:
                return a.getDepartment().compareToIgnoreCase(b.getDepartment());
            case 5:
                return Double.compare(a.getWage(), b.getWage());
            case 6:
                return Double.compare(a.getPCompRate(), b.getPCompRate());
            default:
                return 0;
        }
    }
}
