import java.io.File;
import java.util.*;

public class ReadFilmData {

	public static Film[] loadFilms() throws Exception {
		// parsing and reading the CSV file data into the film (object) array
		// provide the path here...
		File directory = new File("./");
		String name = directory.getAbsolutePath() + "//Film.csv";
		Scanner sc = new Scanner(new File(name));
		Film[] films = new Film[10000];

		// this will just print the header in CSV file
		sc.nextLine();

		int i = 0;
		String st = "";

		while (sc.hasNextLine()) // returns a boolean value
		{
			st = sc.nextLine();
			String[] data = st.split(",");
			films[i++] = new Film(Integer.parseInt(data[0]), data[1], data[2], data[3], Float.parseFloat(data[4]),
					Float.parseFloat(data[5]));
		}
		sc.close(); // closes the scanner

		return films;
	}
}