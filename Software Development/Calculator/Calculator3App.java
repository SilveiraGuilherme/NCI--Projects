/*
Calculator3App
@author: Guilherme Silveira
@date: 15/10/2024
*/

import javax.swing.JOptionPane;

public class Calculator3App{
	public static void main(String[] args){
		//Declare variables
		double x, y, result;
		int opt;
		
		//Declare and create objects
		
		//Input
		x = Double.parseDouble(JOptionPane.showInputDialog(null, "Please, enter the first number: "));
		y = Double.parseDouble(JOptionPane.showInputDialog(null, "Please, enter the second number: "));
		opt = Integer.parseInt(JOptionPane.showInputDialog(null, "Please, choose one option:\n1 to add the two numbers \n2 to subtract the two numbers \n3 to multiply the two numbers \n4 to divide the two numbers"));
		
		//Process and output
		switch (opt){
			//Addition
			case 1:
				result = x + y;				
				JOptionPane.showMessageDialog(null, "The sum of the numbers " + x + " and " + y + " is " + result + ".");
				break;
			//Difference
			case 2:
				result = x - y;
				JOptionPane.showMessageDialog(null, "The difference between the numbers " + x + " and " + y + " is " + result + ".");
				break;
			//Product
			case 3:
				result = x * y;
				JOptionPane.showMessageDialog(null, "The product of the numbers " + x + " and " + y + " is " + result + ".");
				break;
			//Division
			case 4:
				if (y != 0){
					result = x / y;
					JOptionPane.showMessageDialog(null, "The division of the numbers " + x + " and " + y + " is " + result + ".");
				} else {
					JOptionPane.showMessageDialog(null, "Error: Division by zero is not allowed.");
				}
				break;
			//Invalid option
			default:
				JOptionPane.showMessageDialog(null, "You entered an invalid option.");
		}
	}
}