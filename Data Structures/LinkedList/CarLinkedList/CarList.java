public interface CarList {

    public boolean isEmpty();

    public int readySize();

    public String currentProblems();

    public double getAverage();

    public void add(Car el);

    public void removeInd(int index);

    public void remove(String target);
}
