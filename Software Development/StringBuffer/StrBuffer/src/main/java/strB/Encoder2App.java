package strB;

import javax.swing.JOptionPane;

/**
 * Encoder2App
 * @author guilhermesilveira
 * Date: 02/12/2024
 */

public class Encoder2App {
    public static void main(String[] args) {
    // Declare variables
    String sentence, newSentence;
    
    // Declare and create objects
    Encoder2 myE = new Encoder2();
    
    // Input
    sentence = JOptionPane.showInputDialog(null, "Please, enter a sentence");
            
    // Process
    myE.setSentence(sentence);
    myE.compute();
    
    // Output
    newSentence = myE.getNewSentence();
    JOptionPane.showMessageDialog(null, "The sentence: " + sentence + "\nEncoded is: " + newSentence + ".");
    }
}