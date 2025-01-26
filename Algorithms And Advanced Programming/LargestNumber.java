import javax.swing.JOptionPane;

public class LargestNumber {
    public static void main(String args[]) {
        int[] numList = new int[10];

        for (int i = 0; i < numList.length; i++) {
            numList[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter a number (" + i + " / 10)"));
        }

        long startTime = System.nanoTime();
        int largest = getLargest(numList);
        long endTime = System.nanoTime();
        long elapsedTime = endTime - startTime;

        JOptionPane.showMessageDialog(null, "The largest number is " + largest + ".");
        JOptionPane.showMessageDialog(null, "It took " + elapsedTime + " nanoseconds to perform this operation.");

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
