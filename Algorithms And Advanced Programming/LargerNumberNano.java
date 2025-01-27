import javax.swing.JOptionPane;

public class LargerNumberNano {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

        long startTime = System.nanoTime();
        int largest = getLargest(num1, num2);
        long elapsedTime = System.nanoTime() - startTime;

        JOptionPane.showMessageDialog(null, "The largest number is " + largest + " and it took " + elapsedTime
                + " nanoseconds to perform this operation.");
    }

    public static int getLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
