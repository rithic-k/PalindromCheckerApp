import java.util.Scanner;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // ================= UC1 =================
        System.out.println("=================================");
        System.out.println("        Palindrome Checker App   ");
        System.out.println("        Version: 1.0             ");
        System.out.println("=================================");
        System.out.println("Welcome to the Palindrome Checker Application!\n");

        // ================= UC2 =================
        System.out.println("UC2: Hardcoded Palindrome Check");

        String word = "madam";

        if (word.equals(new StringBuilder(word).reverse().toString())) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        // ================= UC3 =================
        System.out.println("\nUC3: Palindrome Check Using String Reverse");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = scanner.nextLine();

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        // ================= UC4 =================
        System.out.println("\nUC4: Character Array Based Palindrome Check");

        System.out.print("Enter another word: ");
        String input = scanner.nextLine();

        char[] characters = input.toCharArray();

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
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}