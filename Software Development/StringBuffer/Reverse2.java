/*
* Reverse2.java
* @author Enda
* 25/11/2024
*/

public class Reverse2{
		// Declare variables
		private String word, newWord;
		private StringBuffer strBuff;
		
		//Constructor
		public Reverse2() {
			word = " ";
			newWord = " ";
			strBuff = new StringBuffer();
		}
		
		//Compute
		public void compute() {
			for(int i = (word.length() - 1); i >= 0; i--){
				strBuff.append(word.charAt(i));
			}
			newWord = strBuff.toString();
		}

		// Setter and Getter
		public void setWord(String word) {
			this.word = word;
		}
		
		public String getNewWord() {
			return newWord;
		}
} // class