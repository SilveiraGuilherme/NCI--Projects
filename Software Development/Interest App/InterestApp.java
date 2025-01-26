/*
* InterestApp.java
* @autor Guilherme Silveira
* 07/10/2024
*/

// Import the address to the code
import java.util.Scanner;

public class InterestApp{
	public static void main(String[] args){
		//Declare variables
		int numMonths; double amount; //input variables
		double interest, totalAmount; //output variables
		
		//Declare and creat object
		Scanner sc = new Scanner(System.in);
		Interest myInt = new Interest();
		
		//Input
		System.out.println("Please, enter the number of months: ");
		numMonths = sc.nextInt();
		
		System.out.println("Please, enter the amount to be borrowed: ");
		amount = sc.nextDouble();
		
		//Process
		myInt.setNumMonths(numMonths);
		myInt.setAmount(amount);
		
		myInt.compute();
		
		//Output
		interest = myInt.getInterest();
		totalAmount = myInt.getTotalAmount();
		
		System.out.println("Interest: " + interest + ". Total amount: " + totalAmount + ".");
	}
}