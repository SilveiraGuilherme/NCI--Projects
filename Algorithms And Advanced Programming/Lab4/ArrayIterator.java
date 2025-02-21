import java.util.NoSuchElementException;
import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
    int index;
    int size;
    T[] data;

    ArrayIterator(T[] data, int size) {
        this.data = data;
        this.size = size;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        if (index == size) {
            throw new NoSuchElementException();
        }
        T item = (T) data[index];
        index++;
        return item;
    }
}
