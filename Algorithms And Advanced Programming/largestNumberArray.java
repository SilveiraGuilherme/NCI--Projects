import javax.swing.JOptionPane;
import java.util.Random;

public class largestNumberArray {
    public static void main(String[] args) {
        Random random = new Random(); // generates random numbers between 10 and 100000
        int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100000);
        }

        long startTime = System.nanoTime();
        int largest = getLargest(numbers);
        long elapsedTime = System.nanoTime() - startTime;

        JOptionPane.showMessageDialog(null, "The largest number is " + largest + " and it took " + elapsedTime
                + " nanoseconds to perform this operation.");
    }

    public static int getLargest(int[] numList) {
        int max = numList[0];

        for (int i = 0; i < numList.length; i++) {
            if (numList[i] > max) {
                max = numList[i];
            }
        }
        return max;
    }
}
