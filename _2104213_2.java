import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _2104213_2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        String inputDateStr = scanner.nextLine();

        try { // Parse the input date in "yyyy-MM-dd" format to a LocalDate object
            LocalDate inputDate = LocalDate.parse(inputDateStr);

            // Define the desired output date format "dd/MM/yyyy"
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

            // Format the date to the desired output format
            String outputDateStr = inputDate.format(outputFormatter);

            System.out.println(outputDateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM-dd format.");
        }
    }
}/*
Output:
Input date (yyyy-MM-dd): 2005-03-14
14/03/2005
*/