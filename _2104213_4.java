import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;

public class _2104213_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        String inputList = scanner.nextLine();

        // Split the input list into individual strings (numbers) and convert them to integers
        String[] numbersAsString = inputList.split("[,\\s]+");
        int[] numbers = new int[numbersAsString.length];

        for (int i = 0; i < numbersAsString.length; i++) {
            try {
                numbers[i] = Integer.parseInt(numbersAsString[i]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter space or comma-separated integers.");
                return;
            }
        }

        // Sort the numbers in ascending order
        Arrays.sort(numbers);

        // Build the output string
        StringJoiner joiner = new StringJoiner(", ");
        for (int num : numbers) {
            joiner.add(String.valueOf(num));
        }

        // Print the sorted list
        System.out.println(joiner.toString());
    }
}
/*
Output
Input list of space or comma-separated integers: 3,4,5,6
3, 4, 5, 6 */
