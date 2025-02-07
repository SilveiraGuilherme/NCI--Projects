public interface CarList<T> {

    public boolean isEmpty();

    public int readySize();

    public String currentProblems();

    public double getAverage();

    public void add(Car el);

    public void remove(String target);
}
