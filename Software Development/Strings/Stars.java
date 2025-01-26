/*
/ Stars.Java
/ @author Guilherme
/ 18/11/24
*/

import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {
		//Declare variables
		String word, password = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, enter a word");
		
		word = sc.nextLine();
		
		System.out.println("...you entered the word: " + word);
		
		for (int i = 0; i < word.length(); i++) {
			password = password + "*";
		}
		
		System.out.println(password);
	}
}