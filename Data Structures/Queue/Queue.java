public interface Queue<T> {
    public boolean isEmpty();

    public int size();

    public void enqueue(T elem);

    public T dequeue();

    public T peek();
}
