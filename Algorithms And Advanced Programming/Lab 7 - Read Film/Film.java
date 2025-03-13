public class Film {
    // variables
    private int filmID;
    private String genre;
    private String directorName;
    private String title;
    private float length;
    private float rating;

    // constructor
    public Film(int filmID, String genre, String directorName, String title, float length, float rating) {
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
    public String toString() {
        return "==========================================================================================\nFilm ID:\t"
                + this.filmID + "\nGenre:\t\t"
                + this.genre
                + "\nDirector Name:\t" + this.directorName + "\nTitle:\t\t" + this.title + "\nLength:\t\t" + this.title
                + "\nLength:\t\t" + this.length + "\nRating:\t\t" + this.rating;
    }
}
