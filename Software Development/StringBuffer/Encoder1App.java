/*
* Encoder1App.java
* @author Enda
* 25/11/2024
*/

import javax.swing.JOptionPane;

public class Encoder1App{
	public static void main (String args[]){
		// Declare variables
		String word, newWord;
		
		do {
			//Declare and Create objects
			Encoder1 myE = new Encoder1();

			// Input
			word = JOptionPane.showInputDialog(null, "Please, enter a word");

			// Process
			myE.setWord(word);
			myE.compute();
		
			//Output
			newWord = myE.getNewWord();
		
			JOptionPane.showMessageDialog(null, "The encoded version of the word '" + word + "' is " + newWord + ".");
			choice = JOptionPane.showInputDialog(null, "Would you like to enter a new sentence? (Yes / No)");
		} while (choice.equalsIgnoreCase("yes"));
	} // main
} // class