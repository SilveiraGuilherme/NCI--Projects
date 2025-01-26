/*
* AverageApp.java
* @Guilherme Silveira
* Date: 07/11/2024
*/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class AverageApp {
	public static void main(String[] args) {
		double nums[] = new double[5];
		double sum = 0, avg;
	
		for(int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
			sum = sum + nums[i];
		}
		
		avg = sum / 5;
		
		JOptionPane.showMessageDialog(null, "The average number is " + avg + " for the numbers " + Arrays.toString(nums));
	}
}