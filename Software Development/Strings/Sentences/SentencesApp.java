/*
/ SentencesApp.Java
/ @author Guilherme
/ 18/11/24
*/

import java.util.Scanner;

public class SentencesApp {
	public static void main(String[] args) {
		//Declare variables
		String sentence;
		int numWords;
		
		Scanner sc = new Scanner(System.in);
		Sentences myS = new Sentences();
		
		//Input
		do {
			System.out.println("Please, enter a sentence");
			sentence = sc.nextLine();			
		} while ( sentence.length() <= 0);
        
		//Process
		myS.setSentence(sentence);
		myS.compute();
		
		//Output
		numWords = myS.getNumWords();
		System.out.println("...you entered the sentence: " + sentence + "\nIt has " + numWords + " word(s).");
		
	}
}