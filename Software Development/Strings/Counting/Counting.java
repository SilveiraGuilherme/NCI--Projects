/*
* Counting.java
* @author Enda
* 25/11/2024
*/

public class Counting{
		// Declare variables
		private String sentence;
		private int numVowels = 0, numCons = 0, numSpaces = 0;
		
		//Constructor
		public Counting() {
		}
		
		// Setter
		public void setSentence(String sentence) {
			this.sentence = sentence;
		}		
		
		//Compute
		public void compute() {
			for(int i = 0; i < sentence.length(); i++){
				if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
					numVowels++;
				} else if (sentence.charAt(i) == ' ') {
					numSpaces++;
				} else {
					numCons++;
				}
			}
		}

		// Getters
		public int getNumVowels() {
			return numVowels;
		}
		public int getNumCons() {
			return numCons;
		}
		public int getNumSpaces() {
			return numSpaces;
		}
} // class