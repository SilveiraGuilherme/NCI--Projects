/*
* PigLatin.java
* @author Enda
* 25/11/2024
*/

public class PigLatin{
		// Declare variables
		private String word, newWord;
		private StringBuffer strBuff;
		
		//Constructor
		public PigLatin() {
			word = " ";
			newWord = " ";
			strBuff = new StringBuffer();
		}
		
		//Compute
		public void compute() {
			for(int i = 1; i < word.length(); i++){
				strBuff.append(word.charAt(i));
			}
			strBuff.append(word.charAt(0));
			strBuff.append("ay");
			
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