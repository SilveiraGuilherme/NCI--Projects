/*
* Cinema5App.java
* @author Enda
* 21/10/2024
*/
import javax.swing.JOptionPane;

public class Cinema5App{
	public static void main (String args[]){
		// Declare variables
		int age;
		double cost, totalCost = 0;
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
			
			totalCost = totalCost + cost;
			
			moreTickets = JOptionPane.showInputDialog(null, "Would you like to check another ticket? Yes or No?");
			moreTickets = moreTickets.toLowerCase();
			
			} while (moreTickets.equals("yes"));
		
		JOptionPane.showMessageDialog(null, "The total cost of your tickets is: € " + totalCost + ".");
	} // main
} // class
