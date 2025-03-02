public interface MovieList {
    public boolean isEmpty();

    public String genreSearch(String genre);

    public double getAverage();

    public void add(Movie movie);

    public int size();

    public boolean contains(String title);

    public String remove(String target);
}
