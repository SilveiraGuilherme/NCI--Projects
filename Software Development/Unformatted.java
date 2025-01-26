/*
*Unformatted.java
*@author Frances Sheridan
*21/08/2012
*/

import java.util.Scanner;

public class Unformatted {
	public static void main(String[] args) {
		//Declare variables
		final double X = 13.45; final int Y = 34;
		double salary; int num;
		
		//Declare and create objects
		Scanner keyboard = new Scanner(System.in);
		
		//Input
		System.out.println("Enter an integer less than 70: ");
		num = keyboard.nextInt();
		
		salary=num*X;
		
		System.out.println("Wages: " + salary);
		System.out.println("X = " + X);
		System.out.println("X + Y = " + (X + Y));
	}
}