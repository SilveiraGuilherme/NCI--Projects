/*
* Cinema4App.java
* @author Enda
* 21/10/2024
*/
import javax.swing.JOptionPane;

public class Cinema4App{
	public static void main (String args[]){
		// Declare variables
		int age;
		double cost;
		String moreTickets;

		// Declare and create objects
		Cinema myC = new Cinema();


		// Input
		do {
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the age"));
			
			// Process
			myC.setAge(age);
			myC.compute();

			// Output
			cost = myC.getCost();

			JOptionPane.showMessageDialog(null, "For age: " + age + ", the cost is: €" + cost);
			
			moreTickets = JOptionPane.showInputDialog(null, "Would you like to check another ticket? Yes or No?");
			moreTickets = moreTickets.toLowerCase();
			} while (moreTickets.equals("yes"));
	} // main
} // class
