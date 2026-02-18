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

    }
}
