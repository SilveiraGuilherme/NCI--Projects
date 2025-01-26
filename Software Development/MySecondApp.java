/*
* MySecondApp.java
* @author Enda
* 26/09/24
*/

//Import the address to the code
import java.util.Scanner;

public class MySecondApp{
	public static void main(String[] args){
		//Declare variables
		String name;
		int age;
		
		//Declare and create object
		Scanner sc = new Scanner (System.in);
		
		
		//Input
		System.out.println("Please, enter your name");
		name = sc.next();
		
		System.out.println("Please, enter your age");
		age = sc.nextInt();
		
		//Process & Output
		
		System.out.println("Hello " + name + ", you are " + age + " years old.");
	
	
		
	} //main
} //class