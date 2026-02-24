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
        System.out.println("System is ready to proceed to the next use case...");

        // =========================
        // UC2 - Hardcoded Palindrome Check
        // =========================
        System.out.println("\nExecuting UC2: Hardcoded Palindrome Check");
        System.out.println("--------------------------------------------------");

        // Hardcoded String Literal
        String word = "bob";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Palindrome validation using if-else
        if (word.equals(reversed)) {
            System.out.println("Result: \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + word + "\" is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Program execution completed.");
    }
}