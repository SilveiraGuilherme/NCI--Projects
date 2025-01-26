/*
EggsApp.java
@autor Guilherme Silveira
@date: 08/10/2024
*/

//Import the address to the code
import java.util.Scanner;

//Declare the class
public class EggsApp{
	//Declare the main method
	public static void main(String[] args){
		//Declare variables
		int eggs; //input variable
		int boxes, eggsLeft; //output variable
		
		//Declare and create objects
		Scanner sc = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the number of eggs you have collected: ");
		eggs = sc.nextInt();
		
		// Process
		eggsLeft = eggs%12;
		boxes = (eggs - eggsLeft) / 12;
		
		//Output
		System.out.println("You will need " + boxes + " boxes and there wil be " + eggsLeft + " left.");
	}
}