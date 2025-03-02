public class MovieApp {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Intersttelar", "Movie about the universe", "Sci-Fi", 140, 5);
        Movie movie3 = new Movie("Mamma Mia", "Famous play", "Musical", 120, 4);
        Movie movie4 = new Movie("Anora", "Such a plot twist", "Drama", 135, 4);
        Movie movie2 = new Movie("Les Miserables", "A classic from Victor Hugo", "Musical", 130, 4);
        Movie movie5 = new Movie("The Devil Wears Prada", "That's all", "Comedy", 1100, 5);

        MovieLinkedList movieList = new MovieLinkedList();

        System.out.println(movieList.isEmpty());

        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);

        System.out.println(movieList);
        System.out.println(movieList.isEmpty());
        System.out.println(movieList.size());
        System.out.println(movieList.contains("THE DEVIL WEARS PRADA"));
        System.out.println(movieList.genreSearch("Musical"));
        System.out.println(movieList.getAverage());
        System.out.println(movieList.remove("LES MISERABLES"));
        System.out.println(movieList);

    }
}
