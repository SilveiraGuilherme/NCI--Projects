/*
* Cinema6App.java
* @author Enda
* 21/10/2024
*/
import javax.swing.JOptionPane;

public class Cinema6App{
	public static void main (String args[]){
		// Declare variables
		int age;
		double cost, totalCost = 0;
		String moreTickets = "";

		// Declare and create objects
		Cinema myC = new Cinema();


		// Input
		int i = 0;
		
		do {
			age = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the age"));
		
			// Process
			myC.setAge(age);
			myC.compute();

			// Output
			cost = myC.getCost();

			JOptionPane.showMessageDialog(null, "For age: " + age + ", the cost is: €" + cost);
			
			totalCost = totalCost + cost;
			i++;
			
			if(i < 4){				
				moreTickets = JOptionPane.showInputDialog(null, "Would you like to check another ticket? Yes or No?");
				moreTickets = moreTickets.toLowerCase();
				} else {
					}				
			} while (moreTickets.equals("yes") && i < 4);			

		JOptionPane.showMessageDialog(null, "The total cost of your tickets is: € " + totalCost + ".");			
		
	} // main
} // class
