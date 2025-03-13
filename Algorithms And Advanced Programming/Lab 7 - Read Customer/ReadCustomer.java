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
				// input is the name which stays as string
				String name = tempArr[0];
				// input date of birth is a date
				Date DOB = ft.parse(tempArr[1]);
				// input is the address so it's string
				String address = tempArr[2];

				customerList.add(new Customer(name, DOB, address));
			}
		} finally { // closes the buffered read regardless of whether an exception was called.
			if (br != null) {
				br.close();
			}
		}

		// prints out all the movie data
		for (Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}