/*
* StudentID.java
* @author Enda
* 25/11/2024
*/

public class StudentID{
		// Declare variables
		private String word, newWord;
		private	StringBuffer strBuff, strBuff2;
		
		//Constructor
		public StudentID() {
			word = " ";
			newWord = " ";
			strBuff = new StringBuffer();
			strBuff2 = new StringBuffer();
		}
		
		// Setter
		public void setWord(String word) {
			this.word = word;
		}		
		
		//Compute
		public void compute() {
			for(int i = word.length() - 1; i >= 0; i--) {
				strBuff.append(word.charAt(i));
			}
			for(int i = 0; i < strBuff.length(); i++){
				if (strBuff.charAt(i) == 'a') {
					strBuff2.append('1');
				} else if (strBuff.charAt(i) == 'e') {
					strBuff2.append('5');
				} else if (strBuff.charAt(i) == 'i') {
					strBuff2.append('9');
				} else if (strBuff.charAt(i) == 'o') {
					strBuff2.append(15);
				} else if (strBuff.charAt(i) == 'u') {
					strBuff2.append(21);
				} else {
					strBuff2.append(strBuff.charAt(i));
				}
			}
			newWord = strBuff2.toString();
		}

		// Getters
		public String getNewWord() {
			return newWord;
		}
} // class