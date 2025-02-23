// Write a recursive function that detects if a string is a palindrome
// (a palindrome is a word that can be read the same way backward and forward, e.g. racecar, navan, abba). 

public class RecPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("Racecar"));

    }

    public static boolean checkPalindrome(String word) {
        word = word.toLowerCase(); // convert to lower case to handle case insensitivity
        // base case: if the word has 1 or 0 characters it is a palíndrome
        if (word.length() <= 1) {
            return true;
        }
        // check if the first and last letters of the word match
        if (word.charAt(0) != word.charAt(word.length() - 1)) {
            return false;
        }
        return checkPalindrome(word.substring(1, word.length() - 1));
    }
}
