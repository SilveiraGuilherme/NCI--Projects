import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class ReadCustomer {

	public static void main(String args[]) throws Exception {
		BufferedReader br = null;
		ArrayList<Customer> customerList = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader("customer_data.csv"));
			String line = "";
			String[] tempArr; // using this to store each column in a line

			br.readLine(); // reading first line to avoid the header

			// this is used to format the incoming date
			SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");

			while ((line = br.readLine()) != null) { // reading each line of file
				tempArr = line.split(","); // each column has a comma between it
				String name = tempArr[0];
				String dateStr = tempArr[1];
				Date DOB = null;
				String address = tempArr[2];

				try {
					DOB = ft.parse(dateStr);
				} catch (Exception e) {
					System.err.println("Invalid date for customer '" + name + "': " + dateStr);
					// DOB stays null
				}

				customerList.add(new Customer(name, DOB, address));
			}
		} finally { // closes the buffered read regardless of whether an exception was called.
			if (br != null) {
				br.close();
			}
		}

		customerList.sort(null); // I have to use null as a parameter and it will follow the natural ordering
									// defined by compareTo

		// prints out all the movie data
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}