import java.io.*;
import java.util.*;

public class ReadCar {

	public static void main(String args[]) throws Exception {
		BufferedReader br = null;
		ArrayList<Car> carList = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader("cars.csv"));
			String line = "";
			String[] tempArr; // using this to store each column in a line

			br.readLine(); // reading first line to avoid the header

			while ((line = br.readLine()) != null) { // reading each line of file
				tempArr = line.split(","); // each column has a comma between it
				String id = tempArr[0];
				String year = tempArr[1];
				String make = tempArr[2];
				String model = tempArr[3];
				String colour = tempArr[4];
				String price = tempArr[5];

				carList.add(new Car(Integer.parseInt(id), Integer.parseInt(year), make, model, colour,
						Integer.parseInt(price)));
			}
		} finally { // closes the buffered read regardless of whether an exception was called.
			if (br != null) {
				br.close();
			}
		}

		carList.sort(null);

		// prints out all the movie data
		for (Car car : carList) {
			System.out.println(car);
		}
	}
}