import java.io.*;
import java.util.*;

public class ReadFilmData {
	public static void main(String args[]) throws Exception {
		BufferedReader br = null;
		ArrayList<Film> filmList = new ArrayList<>();

		try {
			br = new BufferedReader(new FileReader("film_data.csv"));
			String line = "";
			String[] tempArr; // using this to store each column in a line

			br.readLine(); // reading first line to avoid the header

			while ((line = br.readLine()) != null) { // reading each line of file
				tempArr = line.split(","); // each column has a comma between it
				// input filmID is an integer
				int filmID = Integer.parseInt(tempArr[0]);
				// input is the genre which stays as string
				String genre = tempArr[1];
				// input director name is already a string
				String directorName = tempArr[2];
				// associating each input with a variable type
				// input is the title so it's string
				String title = tempArr[3];
				// input is a Length
				float length = Float.parseFloat(tempArr[4]);
				// third input is the rating which is an int
				float rating = Float.parseFloat(tempArr[5]);

				filmList.add(new Film(filmID, genre, directorName, title, length, rating));
			}
		} finally { // closes the buffered read regardless of whether an exception was called.
			if (br != null) {
				br.close();
			}
		}

		// prints out all the movie data
		for (Film film : filmList) {
			System.out.println(film);
		}
	}
}