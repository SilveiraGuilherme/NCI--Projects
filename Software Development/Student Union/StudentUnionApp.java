/*
StudentUnionApp
@author: Guilherme Silveira
@date: 08/10/2024
*/

import java.util.Scanner;

public class StudentUnionApp{
	public static void main(String[] args){
		//Declare variables
		int numCaps, numShirts, numHoodies; //input variables
		int totalCost; //output variable
		
		//Declare and create objects
		Scanner sc = new Scanner(System.in);
		StudentUnion myS = new StudentUnion();
		
		//Input
		System.out.println("How many caps would you like to buy? ");
		numCaps = sc.nextInt();
		System.out.println("How many shirts would you like to buy? ");
		numShirts = sc.nextInt();
		System.out.println("How many hoodies would you like to buy? ");
		numHoodies = sc.nextInt();
		
		//Process
		myS.setNumCaps(numCaps);
		myS.setNumShirts(numShirts);
		myS.setNumHoodies(numHoodies);
		
		myS.compute();
		
		//Output
		totalCost = myS.getTotalCost();
		
		System.out.println("The total cost is: " + totalCost + ".");
	}
}