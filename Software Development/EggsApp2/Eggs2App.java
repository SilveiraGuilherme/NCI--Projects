/*
Eggs2App.java
@autor Guilherme Silveira
@date: 08/10/2024
*/

//Import the address to the code
import java.util.Scanner;

//Declare the class
public class Eggs2App{
	//Declare the main method
	public static void main(String[] args){
		//Declare variables
		int eggs; //input variable
		int boxes, eggsLeft; //output variable
		
		//Declare and create objects
		Scanner sc = new Scanner(System.in);
		Eggs2 myE = new Eggs2();
		
		//Input
		System.out.println("Enter the number of eggs you have collected: ");
		eggs = sc.nextInt();
		
		// Process
		myE.setEggs(eggs);
		myE.compute();
		
		//Output
		boxes = myE.getBoxes();
		eggsLeft = myE.getEggsLeft();
		
		System.out.println("You will need " + boxes + " boxes and there wil be " + eggsLeft + " left.");
	}
}