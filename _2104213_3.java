
import java.util.Scanner;

public class _2104213_3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        String inputSentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = inputSentence.split("\\s+");

        // Count the number of words
        int wordCount = words.length;

        // Count the number of non-space characters
        int nonSpaceCharCount = inputSentence.replaceAll("\\s", "").length();

        // Calculate the product of word count and non-space character count
        int product = wordCount * nonSpaceCharCount;

        System.out.println(product);
    }
}/*
Output:
Input sentence: Java programming is fun
80 */

