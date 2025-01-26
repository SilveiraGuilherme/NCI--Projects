/*
/ WordApp.Java
/ @author Guilherme
/ 18/11/24
*/

import javax.swing.JOptionPane;

public class WordApp {
	public static void main(String[] args) {
		//Declare variables
		String word;
		int numLetters, numSpaces;
		
		Word myW = new Word();
		
		//Input
		do {
			numSpaces = 0;
			word = JOptionPane.showInputDialog(null, "Please, enter (only) one word");
			for (int i = 0; i < word.length(); i++) {
				if (word.charAt(i) == ' ') {
					numSpaces++;
				}
			}
		} while (numSpaces > 0 || word.length() == 0);
        
		//Process
		myW.setWord(word);
		myW.compute();
		
		//Output
		numLetters = myW.getNumLetters();
		JOptionPane.showMessageDialog(null, "The word " + word + " has " + numLetters + " letters.");
	}
}