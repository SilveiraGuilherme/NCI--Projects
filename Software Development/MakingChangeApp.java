/*
MakingChangeApp.java
@autor Guilherme Silveira
@date: 08/10/2024
*/

//Import the address to the code
import java.util.Scanner;

//Declare the class
public class MakingChangeApp{
	//Declare the main method
	public static void main(String[] args){
		//Declare variables
		int totalCost, hasPaid; //input variable
		int change, fifty, twenty, ten, five, two, one; //output variable
		
		//Declare and create objects
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the total cost of the products: ");
		totalCost = sc.nextInt();
		System.out.println("Enter the amount paid by the customer: ");
		hasPaid = sc.nextInt();
		
		// Process
		change = hasPaid - totalCost;
		fifty = change / 50;
		twenty = change%50 / 20;
		ten = change%20 / 10;
		five = change%10 / 5;
		two = change%5 / 2;
		one = change%2 / 1;
		
		//Output
		System.out.println("Return " + fifty + " note(s) of 50, " + twenty + " note(s) of 20, " + ten + " note(s) of 10, " + five + " note(s) of 5, " + two + " coin(s) of 2 and " + one + " coin(s) of one.");
	}
}