/*
/ Sentences.Java
/ @author Guilherme
/ 18/11/24
*/

import java.util.Scanner;

public class Sentences {
		//Declare variables
		private String sentence;
		private int numWords = 1;
		
		//Constructor
		public Sentences() {
			
		}
		
		//Setters
		public void setSentence(String sentence) {
			this.sentence = sentence;
		}
		
		//Compute
		public void compute() {
			for (int i = 0; i < sentence.length(); i++) {
				if (sentence.charAt(i) == ' ') {
					if (sentence.charAt(i + 1) != ' ') {
						numWords++;
					}
				}
			}
		}
		
		//Getters
		public int getNumWords() {
			return numWords;
		}
}