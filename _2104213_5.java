import java.util.Scanner;

public class _2104213_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        String input = scanner.nextLine();

        // Remove any spaces and convert the string to lowercase
        String formattedInput = input.replaceAll("\\s", "").toLowerCase();

        // Check if the formatted input string is a palindrome
        boolean isPalindrome = isPalindrome(formattedInput);

        System.out.println(isPalindrome ? "Yes" : "No");
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/*Output
Input: racecar
Yes
 */
