import javax.swing.JOptionPane;

public class LargerNumber {
    public static void main(String args[]) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

        JOptionPane.showMessageDialog(null, getLargest(num1, num2));
    }

    public static int getLargest(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}