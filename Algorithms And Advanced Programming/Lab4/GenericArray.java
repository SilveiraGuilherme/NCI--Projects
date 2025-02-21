import java.util.Iterator;

public class GenericArray<T extends Comparable<T>> {
    private T[] data;
    private int size;

    GenericArray() {
        data = (T[]) (new Comparable[50]);
        size = 0;
    }

    GenericArray(int n) {
        data = (T[]) (new Comparable[n]);
        size = 0;
    }

    public void addItem(T element) {
        data[size] = element;
        size++;
    }

    public int length() {
        return size;
    }

    public boolean search(T element) {
        int index = 0;
        boolean found = false;

        // check the index doesn't pass the size
        // also check that found is false
        while (index < size && !found) {
            if (element.compareTo(data[index]) == 0) {
                found = true;
            }
            index++;
        }
        return found;
    }

    public void selectionSort() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < size; j++) {
                if (data[j].compareTo(data[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(data, i, minIndex);
        }
    }

    public void bubbleSort(T[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1].compareTo(data[j]) > 0) {
                    swap(data, j - 1, j);
                }
            }
        }
    }

    public void insertionSort() {
        int sortedIndex = 1;
        while (sortedIndex < data.length) {
            int currentQueryIndex = sortedIndex;
            while (currentQueryIndex > 0 && (data[currentQueryIndex].compareTo(data[currentQueryIndex - 1]) < 0)) {
                swap(data, currentQueryIndex, currentQueryIndex - 1);
                currentQueryIndex = currentQueryIndex - 1;
            }
            sortedIndex = sortedIndex + 1;
        }
    }

    public void swap(T[] data, int leftIndex, int rightIndex) {
        T temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }

    public void printContent() {
        for (int i = 0; i < size; i++) {
            System.out.println(data[i]);
        }
    }

    public Iterator<T> iterator() {
        return new ArrayIterator<T>(data, size);
    }

}
