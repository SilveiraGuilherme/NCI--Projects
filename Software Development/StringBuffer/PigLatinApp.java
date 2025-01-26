/*
* PigLatinApp.java
* @author Enda
* 25/11/2024
*/

import javax.swing.JOptionPane;

public class PigLatinApp{
	public static void main (String args[]){
		// Declare variables
		String word, newWord;
		
		//Declare and Create objects
		PigLatin myP = new PigLatin();

		// Input
		word = JOptionPane.showInputDialog(null, "Please enter the word to be translated");

		// Process
		myP.setWord(word);
		myP.compute();
		
		//Output
		newWord = myP.getNewWord();
		
		JOptionPane.showMessageDialog(null, "The word " + word + " in PigLatin is " + newWord + ".");
	} // main
} // class