/*
* Cinema4_1App.java
* @author Enda
* 21/10/2024
*/
import javax.swing.JOptionPane;

public class Cinema4_1App{
	public static void main (String args[]){
		// Declare variables
		int age, check;
		double cost;

		// Declare and create objects
		Cinema myC = new Cinema();


		// Input
		do {
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter your age"));
			
			// Process
			myC.setAge(age);
			myC.compute();

			// Output
			cost = myC.getCost();

			JOptionPane.showMessageDialog(null, "For age: " + age + ", the cost is: €" + cost);
			
			check = JOptionPane.showConfirmDialog(null, "Would you like to check another ticket?", "Confirmation", JOptionPane.YES_NO_OPTION);
			} while (check == JOptionPane.YES_OPTION);
	} // main
} // class
