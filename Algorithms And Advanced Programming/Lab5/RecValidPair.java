// Implement an algorithm to detect if a string contains valid pairs of parentheses. 
// e.g., 	valid = (()())()(()()())
// 	invalid = (()(()()

import java.util.Stack;

public class RecValidPair {
    // variables
    // 1 - counter approach
    public static boolean validParCounter(String str) {
        int balance = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                balance++;
            } else if (ch == ')') {
                balance--;
                if (balance < 0) {
                    return false;
                }
            }
        }
        return balance == 0;
    }

    // 2 - stack approach
    public static boolean validParStack(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    // 3 - recursive approach
    public static boolean validParRecursive(String str) {
        // Base Case: if the string is empty, it's valid
        if (str.isEmpty()) {
            return true;
        }
        String newStr = str.replace("()", ""); // removes the first pair of parenthesis found
        // if nothing changes, and the string is not empty, it is invalid.
        if (newStr.equals(str)) {
            return false;
        }
        // recursively check the reduced string
        return validParRecursive(newStr);
    }

    public static void main(String[] args) {
        String validString = "(()())()(()()())";
        String invalidString = "(()(()()";

        System.out.println(validParCounter(validString));
        System.out.println(validParStack(validString));
        System.out.println(validParRecursive(validString));

        System.out.println(validParCounter(invalidString));
        System.out.println(validParStack(invalidString));
        System.out.println(validParRecursive(invalidString));
    }

}
