public class Main {

    // Application Name Constant
    static final String APP_NAME = "Palindrome Checker App";

    // Application Version Constant
    static final String VERSION = "Version 1.0";

    public static void main(String[] args) {

        // =========================
        // UC1 - Welcome Section
        // =========================
        System.out.println("======================================");
        System.out.println("        " + APP_NAME);
        System.out.println("        " + VERSION);
        System.out.println("======================================");

        System.out.println("Welcome to the Palindrome Checker Application!");
        System.out.println("This application will validate whether a given string is a palindrome.");
        System.out.println("--------------------------------------------------");

        // =========================
        // UC2 - Hardcoded Palindrome Check
        // =========================
        System.out.println("\nExecuting UC2: Hardcoded Palindrome Check");
        System.out.println("--------------------------------------------------");

        String word = "bob";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a Palindrome.");
        }

        // =========================
        // UC3 - Palindrome Check Using String Reverse
        // =========================
        System.out.println("\nExecuting UC3: Palindrome Check Using String Reverse");
        System.out.println("--------------------------------------------------");

        // String Data Structure
        String input = "racecar";
        String reversedString = "";

        // Reverse string using for loop
        for (int i = input.length() - 1; i >= 0; i--) {
            // String concatenation (creates new object each time due to immutability)
            reversedString = reversedString + input.charAt(i);
        }

        // Compare original and reversed using equals()
        if (input.equals(reversedString)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Program execution completed.");
    }
}