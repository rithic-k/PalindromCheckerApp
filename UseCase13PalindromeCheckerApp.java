import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static boolean twoPointer(String input) {
        int start = 0, end = input.length() - 1;
        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean stackMethod(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" UC13: Performance Comparison");
        System.out.println("=================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        long start1 = System.nanoTime();
        twoPointer(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        stackMethod(input);
        long end2 = System.nanoTime();

        System.out.println("Two Pointer Time: " + (end1 - start1) + " ns");
        System.out.println("Stack Method Time: " + (end2 - start2) + " ns");

        scanner.close();
    }
}