import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1. Read data - Load 10,000 film records from the CSV file into a Film[] array
        Film[] films = ReadFilmData.loadFilms();

        // Print the list of films before sorting (for visual comparison)
        System.out.println("==========Before Sorting:==========");
        FilmSorter.printFilms(films);

        // Sort the data
        FilmSorter.mergeSort(films, 0, films.length);

        // Print the list again after applying Merge Sort to verify order
        System.out.println("\n==========After Sorting:==========");
        FilmSorter.printFilms(films);

        // 2. Sorting Time analysis
        // Measure and display the average time taken by Merge Sort for various dataset
        // sizes
        FilmSorter.timeAnalysis(films);

        // 3. Search by Title
        // Prompt user for a film title and perform binary search to display matches
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the film title you want to search for: ");
        String input = sc.nextLine();
        FilmSearcher.searchByTitle(films, input);

        sc.close();

        // 4. Search time analysis
        // The selected title must exist in all test slices to ensure valid results
        // The title chosen is the first in the sorted array
        FilmSearcher.searchTimeAnalysis(films, "A break drug could media.");
    }
}
