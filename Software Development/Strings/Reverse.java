/*
/ Reverse.Java
/ @author Guilherme
/ 18/11/24
*/

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		//Declare variables
		String word;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a word");
		
		word = sc.nextLine();
		
		System.out.println("...you entered the word: " + word);
		
		for (int i = word.length() - 1; i >= 0; i--) {
			System.out.println(word.charAt(i));
		}
		
	}
}