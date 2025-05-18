public class Film implements Comparable<Object> {
    // Instance variables representing film properties fromthe CSV dataset
    private int filmID;
    private String genre;
    private String directorName;
    private String title;
    private float length;
    private float rating;

    // Constructor
    public Film(int filmID, String genre, String directorName, String title, float length, float rating) {
        super();
        this.filmID = filmID;
        this.genre = genre;
        this.directorName = directorName;
        this.title = title;
        this.length = length;
        this.rating = rating;
    }

    // setters and getters
    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public int compareTo(Object obj) {
        Film film = (Film) obj;
        // Compare films by title (alphabetically)
        int titleComparison = this.title.compareTo(film.getTitle());

        // If the titles are different, return that comparison
        if (titleComparison != 0) {
            return titleComparison;
        } else {
            // If the titles are the same, compare by filmID
            return this.filmID - film.getFilmID();
        }

    }

    @Override
    public String toString() {
        return "==========================================================================================\nFilm ID:\t"
                + this.filmID + "\nTitle:\t\t" + this.title + "\nGenre:\t\t" + this.genre
                + "\nDirector Name:\t" + this.directorName + "\nLength:\t\t" + this.length
                + "\nRating:\t\t" + this.rating;
    }
}
