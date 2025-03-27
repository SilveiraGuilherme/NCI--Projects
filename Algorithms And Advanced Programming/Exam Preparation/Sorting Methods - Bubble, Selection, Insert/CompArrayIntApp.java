import java.util.Random;

public class CompArrayIntApp {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        int[] data1 = numbers;
        int[] data2 = numbers;
        int[] data3 = numbers;

        ComparisonSortFunctions compare = new ComparisonSortFunctions();

        long startTime1 = System.nanoTime();
        compare.iBubbleSort(data1);
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;

        // for (int item : data1) {
        // System.out.print(item + ", ");
        // }
        System.out.println("------------------------------------------------");
        System.out.println("BubbleSort took " + elapsedTime1 + " nanoseconds.");
        System.out.println("------------------------------------------------");

        long startTime2 = System.nanoTime();
        compare.iSelectionSort(data2);
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;

        // for (int item : data2) {
        // System.out.print(item + ", ");
        // }
        System.out.println("SelectionSort took " + elapsedTime2 + " nanoseconds.");
        System.out.println("------------------------------------------------");

        long startTime3 = System.nanoTime();
        compare.iInsertionSort(data3);
        long endTime3 = System.nanoTime();
        long elapsedTime3 = endTime3 - startTime3;

        // for (int item : data1) {
        // System.out.print(item + ", ");
        // }
        System.out.println("InsertionSort took " + elapsedTime3 + " nanoseconds.");
        System.out.println("------------------------------------------------");
    }
}
