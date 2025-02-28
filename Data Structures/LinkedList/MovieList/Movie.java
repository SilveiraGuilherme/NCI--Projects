public class Movie {
    // declare variables
    private String title, description, genre;
    private int duration, rating;

    // constructor
    public Movie(String title, String description, String genre, int duration, int rating) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
    }

    // getters and setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public int getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return title + "\nDescription: " + description + "\nGenre: " + genre + "\nDuration: " + duration + "\nRating: "
                + rating;
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Movie about dreams", "Action", 120, 4);
        System.out.println(movie);
    }
}