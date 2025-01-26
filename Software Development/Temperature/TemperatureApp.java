/*
TemperatureApp
@author: Guilherme Silveira
@date: 08/10/2024
*/

import java.util.Scanner;

public class TemperatureApp{
	public static void main(String[] args){
		//Declare variables
		int c, f;
		
		//Declare and create objects
		Scanner sc = new Scanner (System.in);
		Temperature myT = new Temperature();
		
		//Input
		System.out.println("Please, enter the temperature in Celsius: ");
		c = sc.nextInt();
		
		//Process
		myT.setC(c);
		myT.compute();
		
		//Output
		f = myT.getF();
		System.out.println(c + " celsius is equivalent to " + f + " in Fahrenheit.");
	}
}