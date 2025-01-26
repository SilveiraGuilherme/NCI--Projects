/*
CalculatorApp
@author: Guilherme Silveira
@date: 08/10/2024
*/

import java.util.Scanner;

public class CalculatorApp{
	public static void main(String[] args){
		//Declare variables
		double x, y, sum, diff;
		
		//Declare and create objects
		Scanner sc = new Scanner (System.in);
		Calculator myC = new Calculator();
		
		//Input
		System.out.println("Please, enter the first number: ");
		x= sc.nextDouble();
		System.out.println("Please, enter the second number: ");
		y= sc.nextDouble();
		
		//Process
		myC.setX(x);
		myC.setY(y);
		
		myC.compute();
		
		//Output
		sum = myC.getSum();
		diff = myC.getDiff();
		
		System.out.println("The sum of the numbers " + x + " and " + y + " is " + sum + " and their difference is " + diff + ".");
	}
}