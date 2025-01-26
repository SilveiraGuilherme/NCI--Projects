/*
* CountingApp.java
* @author Enda
* 25/11/2024
*/

import javax.swing.JOptionPane;

public class CountingApp{
	public static void main (String args[]){
		// Declare variables
		String sentence, choice;
		int numVowels, numCons, numSpaces;
		
		do {
			//Declare and Create objects
			Counting myC = new Counting();

			// Input
			sentence = (JOptionPane.showInputDialog(null, "Please, enter a sentence")).toLowerCase();

			// Process
			myC.setSentence(sentence);
			myC.compute();
		
			//Output
			numVowels = myC.getNumVowels();
			numCons = myC.getNumCons();
			numSpaces = myC.getNumSpaces();
		
			JOptionPane.showMessageDialog(null, "The sentence '" + sentence + "' has " + numVowels + " vowel(s), " + numCons + " consonant(s) and " + numSpaces + " space(s).");
			choice = JOptionPane.showInputDialog(null, "Would you like to enter a new sentence? (Yes / No)");
		} while (choice.equalsIgnoreCase("yes"));
	} // main
} // class