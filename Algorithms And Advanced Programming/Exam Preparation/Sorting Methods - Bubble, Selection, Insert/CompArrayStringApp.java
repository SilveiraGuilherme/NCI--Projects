public class CompArrayStringApp {
    public static void main(String[] args) {
        String[] strings = { "okj", "nkj", "njd", "jdd", "nod", "odj", "njs", "aqi", "oiu", "pld" };

        String[] data1 = strings;
        String[] data2 = strings;
        String[] data3 = strings;

        ComparisonSortFunctions compare = new ComparisonSortFunctions();

        long startTime1 = System.nanoTime();
        compare.sBubbleSort(data1);
        long endTime1 = System.nanoTime();
        long elapsedTime1 = endTime1 - startTime1;

        System.out.println("------------------------------------------------");
        for (String item : data1) {
            System.out.print(item + " ");
        }
        System.out.println("\nBubbleSort took " + elapsedTime1 + " nanoseconds.");
        System.out.println("------------------------------------------------");

        long startTime2 = System.nanoTime();
        compare.sSelectionSort(data2);
        long endTime2 = System.nanoTime();
        long elapsedTime2 = endTime2 - startTime2;

        System.out.println("------------------------------------------------");
        for (String item : data2) {
            System.out.print(item + " ");
        }
        System.out.println("\nSelectionSort took " + elapsedTime2 + " nanoseconds.");
        System.out.println("------------------------------------------------");

        long startTime3 = System.nanoTime();
        compare.sInsertionSort(data3);
        long endTime3 = System.nanoTime();
        long elapsedTime3 = endTime3 - startTime3;

        System.out.println("------------------------------------------------");
        for (String item : data2) {
            System.out.print(item + " ");
        }
        System.out.println("\nInsertionSort took " + elapsedTime3 + " nanoseconds.");
        System.out.println("------------------------------------------------");
    }
}
