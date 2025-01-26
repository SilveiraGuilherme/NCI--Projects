/*
* Cinema3App.java
* @author Enda
* 21/10/2024
*/
import javax.swing.JOptionPane;

public class Cinema3App{
	public static void main (String args[]){
		// Declare variables
		int age, numTickets;
		double cost;

		// Declare and create objects
		Cinema myC = new Cinema();
		
		numTickets = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of tickets that you want to buy"));

		for(int i = 0; i < numTickets; i++){
			// Input
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the age for person " + (i + 1)));

			// Process
			myC.setAge(age);
			myC.compute();

			// Output
			cost = myC.getCost();

			JOptionPane.showMessageDialog(null, "For age: " + age + ", the cost is: E" + cost);
		}
	} // main
} // class
