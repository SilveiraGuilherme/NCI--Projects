/*
CircleApp.java
@author Guilherme Silveira
@date: 08/10/2024
*/

//Import the address to the code
import java.util.Scanner;

//Declare the main class
public class CircleApp {
	//Include the main method (where the program starts execution)
	public static void main(String[] args){
		//Declare variables
		double radius; //input variable
		double area, circumference; //output variables
		
		//Declare the constant PI
		final double PI = 3.14159;

		//Declare and create objects
		Scanner sc = new Scanner(System.in);

		//Input
		System.out.println("Please, enter the radius of the circle: ");
		radius = sc.nextDouble();

		//Process
		area = PI * (radius*radius);
		circumference = 2 * PI * radius;

		//Output
		System.out.println("The area of the circus is " + area + " and the circumference is " + circumference + ".");
	}
}