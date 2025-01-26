import javax.swing.JOptionPane;

public class LargerNumberMilli {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

        JOptionPane.showMessageDialog(null, getLargest(num1, num2));

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        JOptionPane.showMessageDialog(null, "It took " + elapsedTime + " milliseconds to perform this operation.");

    }

    public static int getLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
