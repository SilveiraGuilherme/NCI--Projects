/*
* Reverse2App.java
* @author Enda
* 25/11/2024
*/

import javax.swing.JOptionPane;

public class Reverse2App{
	public static void main (String args[]){
		// Declare variables
		String word, newWord;
		
		//Declare and Create objects
		Reverse2 myR = new Reverse2();

		// Input
		word = JOptionPane.showInputDialog(null, "Please enter the word to be reversed");

		// Process
		myR.setWord(word);
		myR.compute();
		
		//Output
		newWord = myR.getNewWord();
		
		JOptionPane.showMessageDialog(null, "The reverse word is " + newWord + ".");
	} // main
} // class