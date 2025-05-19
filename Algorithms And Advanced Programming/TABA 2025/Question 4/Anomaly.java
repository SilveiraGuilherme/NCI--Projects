import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Anomaly {
    public static void main(String[] args) {
        // Call method to read and print log.txt
        printLogFile("log.txt"); // Show full file content

        processLogFile("log.txt"); // Validate and find anomalies

        writeErrorsToFile("error.txt"); // Output invalid lines
    }

    // VARIABLES
    private static String[] invalidLines = new String[100]; // Hold invalid lines (Up to 100)
    private static int invalidCount = 0; // Number of invalid lines found

    // METHODS
    // Print each line from the file
    public static void printLogFile(String fileName) {
        String[] lines = readLines(fileName);

        for (String line : lines) {
            if (line != null) {
                System.out.println(line);
            }
        }
    }

    // Helper method to read lines
    private static String[] readLines(String fileName) {
        String[] lines = new String[100];
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null && count < lines.length) {
                lines[count++] = line;
            }
        } catch (IOException e) {
            System.out.println("Error reading file" + e.getMessage());
        }
        return lines;
    }

    // Validate each line (skipping the header) and store invalid ones
    public static void processLogFile(String fileName) {
        String[] lines = readLines(fileName);
        boolean isFirstLine = true; // to skip header

        for (String line : lines) {
            // Prevent crashing on empty String[] elements
            if (line == null) {
                continue;
            }
            // Skips the header line from being validated
            if (isFirstLine) {
                isFirstLine = false;
                continue;
            }

            try {
                // Validate each line for anomalies
                validateLine(line);
            } catch (InvalidYearException | InvalidPhoneException | MissingIdException
                    | InvalidCurrencyException e) {
                // Print the error to the console
                System.out.println("Anomaly detected: " + e.getMessage());

                // Save the invalid line to the array (up to 100)
                if (invalidCount < invalidLines.length) {
                    invalidLines[invalidCount] = line;
                    invalidCount++;
                }
            }
        }
    }

    // Split the line into columns and check 4 types of anomaly
    public static void validateLine(String line)
            throws InvalidYearException, InvalidPhoneException, MissingIdException, InvalidCurrencyException {
        String[] columns = line.split(",");

        // Skip empty or malformed lines
        if (columns.length < 6) {
            return;
        }

        String id = columns[0].trim();
        String phone = columns[3].trim();
        String fee = columns[4].trim();
        String date = columns[5].trim();

        // Scenario 1: Date must start with 4 digits followed by '/'
        if (!date.matches("^\\d{4}/.*")) {
            throw new InvalidYearException("Date year must start with 4 digits");
        }

        // Scenario 2: Phone must start with +353
        if (!phone.startsWith("+353")) {
            throw new InvalidPhoneException("Invalid country code in phone number");
        }

        // Scenario 3: ID must exist and be an integer > 0
        try {
            if (id.isEmpty() || Integer.parseInt(id) <= 0) {
                throw new MissingIdException("Invalid or missing ID");
            }
        } catch (NumberFormatException e) {
            throw new MissingIdException("ID is not a valid integer");
        }

        // Scenario 4: Fee must start with €, £ or $
        if (!(fee.startsWith("€") || fee.startsWith("£") || fee.startsWith("$"))) {
            throw new InvalidCurrencyException("Fee does not start with a valid currency symbol.");
        }

    }

    // Write all collected invalid lines to a file (error.txt)
    public static void writeErrorsToFile(String fileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            // Write each invalid line
            for (int i = 0; i < invalidCount; i++) {
                writer.write(invalidLines[i]); // Write the line
                writer.newLine(); // Add a new line after each entry
            }
            // Print confirmation
            System.out.println("Invalid lines written to " + fileName);
        } catch (IOException e) {
            // Handle file writing errors
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // CUSTOM EXCEPTION CLASSES
    // Custom exception for invalid year in date
    public static class InvalidYearException extends Exception {
        public InvalidYearException(String message) {
            super(message);
        }
    }

    // Custom exception for invalid phone number (wrong country code)
    public static class InvalidPhoneException extends Exception {
        public InvalidPhoneException(String message) {
            super(message);
        }
    }

    // Custom exception for missing or invalid ID
    public static class MissingIdException extends Exception {
        public MissingIdException(String message) {
            super(message);
        }
    }

    // Custom exception for invalid currency format in the fee
    public static class InvalidCurrencyException extends Exception {
        public InvalidCurrencyException(String message) {
            super(message);
        }
    }
}
