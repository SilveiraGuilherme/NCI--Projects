/*
* StudentIDApp.java
* @author Enda
* 25/11/2024
*/

import javax.swing.JOptionPane;

public class StudentIDApp{
	public static void main (String args[]){
		// Declare variables
		String word, newWord;
		
		do {
			//Declare and Create objects
			StudentID myS = new StudentID();

			// Input
			word = JOptionPane.showInputDialog(null, "Please, enter a word");

			// Process
			myS.setWord(word);
			myS.compute();
		
			//Output
			newWord = myS.getNewWord();
		
			JOptionPane.showMessageDialog(null, "The encoded version of the word '" + word + "' is " + newWord + ".");
			choice = JOptionPane.showInputDialog(null, "Would you like to enter a new sentence? (Yes / No)");
		} while (choice.equalsIgnoreCase("yes"));
	} // main
} // class