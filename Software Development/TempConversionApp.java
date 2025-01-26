/*
TempConversionApp.java
@autor Guilherme Silveira
@date: 08/10/2024
*/

//Import the address to the code
import java.util.Scanner;

//Declare the class
public class TempConversionApp{
	//Declare the main method
	public static void main(String[] args){
		//Declare variables
		int c; //input variable
		int f; //output variable
		
		//Declare and create objects
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the temperature in celsius: ");
		c = sc.nextInt();
		
		// Process
		f = (c * 9 / 5) + 32;
				
		//Output
		System.out.println("The temperature in Fahrenheit is " + f + ".");
	}
}