package strB;

/**
 * Encoder2
 * @author guilhermesilveira
 * Date: 02/12/20124
 */
public class Encoder2 {
    // Declare variables
    private String sentence, newSentence;
    private int numSpaces;
    private StringBuffer strBuff;
    
    // Constructors
    public Encoder2() {
        sentence = " ";
        newSentence = " ";
        strBuff = new StringBuffer();
    }
    
    public Encoder2(String sentence, String newSentence) {
        this.sentence = sentence;
        this.newSentence = newSentence;
    }
    
    // Setters
    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public void setNewSentence(String newSentence) {
        this.newSentence = newSentence;
    }

    public void setNumSpaces(int numSpaces) {
        this.numSpaces = numSpaces;
    }
    
    
    // Compute
    public void compute(){
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i) == ' '){
                strBuff.append(i);
                numSpaces++;
            } else if(sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A'
                    || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'E'
                    || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'I'
                    || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'O'
                    || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'U'){
                strBuff.append('!');
            } else {
                strBuff.append(sentence.charAt(i));
            }
        }
        strBuff.append(numSpaces);
        newSentence = strBuff.toString();
    }
    
    // Getters
    public String getSentence() {
        return sentence;
    }

    public String getNewSentence() {
        return newSentence;
    }

    public int getNumSpaces() {
        return numSpaces;
    }
    
}