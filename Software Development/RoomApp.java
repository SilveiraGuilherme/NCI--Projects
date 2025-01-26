/*
* MySecondApp.java
* @author Enda
* 27/09/24
*/

//Import the address to the code
import java.util.Scanner;

public class RoomApp{
	public static void main(String[] args){
		//Declare variables
		int length, width, area, perimeter;
		
		//Declare and create object
		Scanner sc = new Scanner (System.in);
		
		//Input
		System.out.println("Enter the length of the room:");
		length = sc.nextInt();
		
		System.out.println("Enter the width of the room:");
		width = sc.nextInt();
		
		//Process
		area = length * width;
		perimeter = 2 * (length + width);
		
		//Output
		System.out.println("For a room with length " + length + " and width " + width + ", the area is " + area + " square meters and the perimeter is " + perimeter + " meters.");
		
}}