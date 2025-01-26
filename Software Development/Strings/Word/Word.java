/*
/ Word.Java
/ @author Guilherme
/ 18/11/24
*/

import java.util.Scanner;

public class Word {
		//Declare variables
		private String word;
		private int numLetters;
		
		//Constructor
		public Word() {
			
		}
		
		//Setters
		public void setWord(String word) {
			this.word = word;
		}
		
		//Compute
		public void compute() {
			numLetters = word.length();
		}
		
		//Getters
		public int getNumLetters() {
			return numLetters;
		}
}