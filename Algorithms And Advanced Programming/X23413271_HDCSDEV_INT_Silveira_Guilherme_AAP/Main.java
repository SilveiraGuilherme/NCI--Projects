import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1. Read the data
        Film[] films = ReadFilmData.loadFilms();

        // System.out.println("==========Before Sorting:==========");
        // FilmSorter.printFilms(films);

        // Sort the data
        FilmSorter.mergeSort(films, 0, films.length);

        // System.out.println("\n==========After Sorting:==========");
        // FilmSorter.printFilms(films);

        // 2. Sorting Time analysis
        // FilmSorter.timeAnalysis(films);

        // 3. Search by Title
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the film title you want to search for: ");
        // String input = sc.nextLine();
        // FilmSearcher.searchByTitle(films, input);

        // sc.close();

        // 4. Search time analysis
        // We need to make sure the title will be present for all the list sizes
        FilmSearcher.searchTimeAnalysis(films, "A break drug could media.");
    }
}
