/*
StudentUnion2App
@author: Guilherme Silveira
@date: 17/10/2024
*/

import javax.swing.JOptionPane;

public class StudentUnion2App{
	public static void main(String[] args){
		//Declare variables
		int numCaps, numShirts, numHoodies; //input variables
		int totalCost; //output variable
		
		//Declare and create objects
		StudentUnion2 myS = new StudentUnion2();
		
		//Input
		numCaps = Integer.parseInt(JOptionPane.showInputDialog(null, "How many caps would you like to buy?"));
		numShirts = Integer.parseInt(JOptionPane.showInputDialog(null, "How many shirts would you like to buy?"));
		numHoodies = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hoodies would you like to buy?"));
		
		//Process
		myS.setNumCaps(numCaps);
		myS.setNumShirts(numShirts);
		myS.setNumHoodies(numHoodies);
		
		myS.compute();
		
		//Output
		totalCost = myS.getTotalCost();
		
		JOptionPane.showMessageDialog(null, "The total cost is " + totalCost + ".");
	}
}