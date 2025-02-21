import java.io.*;
import java.util.regex.*;

public class TestHTML {
    public static boolean HTMLValidator(String filePath) {
        String regex = "<(/?\\w+)[^>]*>"; // capture tag names
        Pattern pattern = Pattern.compile(regex); // compile the pattern
        LinkedListStack<String> stack = new LinkedListStack<String>(); // create an instance of the linked list stack

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) { // read the lines
                Matcher matcher = pattern.matcher(line); // find matches on the line
                while (matcher.find()) { // match found
                    String tag = matcher.group(1); // extracts the tag name (eg. "body", "/body")
                    String fullTag = matcher.group(0); // extracts full tag (eg. "<body>", "</body>")
                    if (!tag.startsWith("/")) { // check if the tag is an opening tag
                        if (fullTag.endsWith("/>")) { // check if the tag is a self-closing tag
                            stack.push(tag); // In case it is a self-closing tag, push and pop it from the stack
                            stack.pop();
                        } else {
                            stack.push(tag); // In case it is an opening tag, push it into the stack
                        }
                    } else { // Not an opening tag (nor a self-closing one), therefore it is a closing tag
                        // Check if it matches the last opening tag. In the case it doesn't, return
                        // false
                        if (stack.isEmpty() || !stack.pop().equals(tag.substring(1))) { //
                            return false;
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stack.isEmpty(); // if the stack is empty at the end, the html has no errors
    }

    public static void main(String[] args) {

        String filePath = "index.html";
        boolean isValid = HTMLValidator(filePath);

        if (isValid) {
            System.out.println("There are no errors in your html file.");
        } else {
            System.out.println("There are errors in your html file.");
        }

    }
}
