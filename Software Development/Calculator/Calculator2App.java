/*
Calculator2App
@author: Guilherme Silveira
@date: 15/10/2024
*/

import java.util.Scanner;

public class Calculator2App{
	public static void main(String[] args){
		//Declare variables
		double x, y, result;
		int opt;
		
		//Declare and create objects
		Scanner sc = new Scanner (System.in);
		
		//Input
		System.out.println("Please, enter the first number: ");
		x= sc.nextDouble();
		System.out.println("Please, enter the second number: ");
		y= sc.nextDouble();
		System.out.println("Please, choose one option:\n1 to add the two numbers \n2 to subtract the two numbers \n3 to multiply the two numbers \n4 to divide the two numbers");
		opt= sc.nextInt();
		
		//Process and output
		switch (opt){
			//Addition
			case 1:
				result = x + y;				
				System.out.println("The sum of the numbers " + x + " and " + y + " is " + result + ".");
				break;
			//Difference
			case 2:
				result = x - y;
				System.out.println("The difference between the numbers " + x + " and " + y + " is " + result + ".");
				break;
			//Product
			case 3:
				result = x * y;
				System.out.println("The product of the numbers " + x + " and " + y + " is " + result + ".");
				break;
			//Division
			case 4:
				if (y != 0){
					result = x / y;
					System.out.println("The division of the numbers " + x + " and " + y + " is " + result + ".");
				} else {
					System.out.println("Error: Division by zero is not allowed.");
				}
				break;
			//Invalid option
			default:
				System.out.println("You entered an invalid option.");
		}
	}
}