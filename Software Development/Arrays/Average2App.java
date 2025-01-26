/*
* Average2App.java
* @Guilherme Silveira
* Date: 07/11/2024
*/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Average2App {
	public static void main(String[] args) {
		double nums[] = new double[5];
		double sum = 0, avg;
	
		//Object
		Avg2 myAvg = new Avg2();
	
		//Input
		for(int i = 0; i < 5; i++) {
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number"));
		}
		
		//Set
		myAvg.setNums(nums);
		
		//Compute
		myAvg.computeAvg();
		
		//Get
		avg = myAvg.getAvg();
		
		//Output
		JOptionPane.showMessageDialog(null, "The average number is " + avg + " for the numbers " + Arrays.toString(nums));
	}
}