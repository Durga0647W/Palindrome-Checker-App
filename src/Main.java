import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

    // Application Name Constant
    static final String APP_NAME = "Palindrome Checker App";

    // Application Version Constant
    static final String VERSION = "Version 1.0";
    // =========================
// UC9 - Recursive Palindrome Method
// =========================
    public static boolean isPalindromeRecursive(String str, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call
        return isPalindromeRecursive(str, start + 1, end - 1);
    }
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
        String word = "madam";
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
        // UC3 - Using String Reverse (Concatenation)
        // =========================
        System.out.println("\nExecuting UC3: Palindrome Check Using String Reverse");
        String input = "racecar";
        String reversedString = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversedString = reversedString + input.charAt(i);
        }

        if (input.equals(reversedString)) {
            System.out.println("Result: \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + input + "\" is NOT a Palindrome.");
        }

        // =========================
        // UC4 - Using Character Array (Two-Pointer Technique)
        // =========================
        System.out.println("\nExecuting UC4: Palindrome Check Using Character Array");

        String text = "level";
        char[] characters = text.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println("Result: \"" + text + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + text + "\" is NOT a Palindrome.");
        }

        // =========================
        // UC5 - Using Stack (LIFO Principle)
        // =========================
        System.out.println("\nExecuting UC5: Palindrome Check Using Stack");

        String stackInput = "radar";

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < stackInput.length(); i++) {
            stack.push(stackInput.charAt(i));
        }

        boolean stackPalindrome = true;

        // Pop characters and compare
        for (int i = 0; i < stackInput.length(); i++) {
            if (stackInput.charAt(i) != stack.pop()) {
                stackPalindrome = false;
                break;
            }
        }

        if (stackPalindrome) {
            System.out.println("Result: \"" + stackInput + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + stackInput + "\" is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------------------");
        System.out.println("Program execution completed.");
        // =========================
        // UC6 - FIFO vs LIFO Demonstration (Queue vs Stack)
        // =========================
        System.out.println("\nExecuting UC6: FIFO vs LIFO (Queue vs Stack)");

        String data = "bob";

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stackDS = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < data.length(); i++) {
            queue.add(data.charAt(i));   // Enqueue
            stackDS.push(data.charAt(i)); // Push
        }

        boolean isPalindromeDS = true;

        // Compare Dequeue (FIFO) with Pop (LIFO)
        for (int i = 0; i < data.length(); i++) {

            char fromQueue = queue.remove();   // Dequeue (FIFO)
            char fromStack = stackDS.pop();    // Pop (LIFO)

            if (fromQueue != fromStack) {
                isPalindromeDS = false;
                break;
            }
        }

        if (isPalindromeDS) {
            System.out.println("Result: \"" + data + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + data + "\" is NOT a Palindrome.");
        }
        // =========================
        // UC9 - Recursive Palindrome Checker
        // =========================
        System.out.println("\nExecuting UC9: Recursive Palindrome Checker");

        String recursiveInput = "refer";

        boolean recursiveResult = isPalindromeRecursive(recursiveInput, 0, recursiveInput.length() - 1);

        if (recursiveResult) {
            System.out.println("Result: \"" + recursiveInput + "\" is a Palindrome.");
        } else {
            System.out.println("Result: \"" + recursiveInput + "\" is NOT a Palindrome.");
        }
        System.out.println("--------------------------------------------------");
        // =========================
        // UC10 - Case-Insensitive & Space-Ignored Palindrome
        // =========================
        System.out.println("\nExecuting UC10: Case-Insensitive & Space-Ignored Palindrome");

        String rawInput = "Never Odd Or Even";

        // Step 1: Normalize the string
        String normalized = rawInput.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Check palindrome using two-pointer logic
        int left = 0;
        int right = normalized.length() - 1;
        boolean isNormalizedPalindrome = true;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isNormalizedPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isNormalizedPalindrome) {
            System.out.println("Result: \"" + rawInput + "\" is a Palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result: \"" + rawInput + "\" is NOT a Palindrome.");
        }

        System.out.println("--------------------------------------------------");
    }
}