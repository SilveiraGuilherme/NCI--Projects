import java.util.Random;

public class ComparisonSortFunctions {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[100000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        int[] data1 = numbers;
        int[] data2 = numbers;
        int[] data3 = numbers;

        long startTime1 = System.nanoTime();
        bubbleSort(data1);
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;

        // for (int item : data1) {
        // System.out.print(item + ", ");
        // }
        System.out.println("------------------------------------------------");
        System.out.println("BubbleSort took " + elapsedTime1 + " nanoseconds.");
        System.out.println("------------------------------------------------");

        long startTime2 = System.nanoTime();
        selectionSort(data2);
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;

        // for (int item : data2) {
        // System.out.print(item + ", ");
        // }
        System.out.println("SelectionSort took " + elapsedTime2 + " nanoseconds.");
        System.out.println("------------------------------------------------");

        long startTime3 = System.nanoTime();
        insertionSort(data3);
        long endTime3 = System.nanoTime();
        long elapsedTime3 = endTime3 - startTime3;

        // for (int item : data1) {
        // System.out.print(item + ", ");
        // }
        System.out.println("InsertionSort took " + elapsedTime3 + " nanoseconds.");
        System.out.println("------------------------------------------------");
    }

    public static void bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 1; j < data.length - i; j++) {
                if (data[j - 1] > data[j]) {
                    swap(data, j - 1, j);
                }
            }
        }
    }

    public static void selectionSort(int[] data) {
        for (int sortedIndex = 0; sortedIndex < data.length; sortedIndex++) {
            int smallestIndex = sortedIndex;
            for (int queryIndex = sortedIndex + 1; queryIndex < data.length; queryIndex++) {
                if (data[queryIndex] < data[smallestIndex]) {
                    smallestIndex = queryIndex;
                }
            }
            swap(data, smallestIndex, sortedIndex);
        }
    }

    public static void insertionSort(int[] data) {
        int sortedIndex = 1;
        while (sortedIndex < data.length) {
            int currentQueryIndex = sortedIndex;
            while (currentQueryIndex > 0 && data[currentQueryIndex] < data[currentQueryIndex - 1]) {
                swap(data, currentQueryIndex, currentQueryIndex - 1);
                currentQueryIndex = currentQueryIndex - 1;
            }
            sortedIndex = sortedIndex + 1;
        }
    }

    public static void swap(int[] data, int leftIndex, int rightIndex) {
        int temp = data[leftIndex];
        data[leftIndex] = data[rightIndex];
        data[rightIndex] = temp;
    }
}