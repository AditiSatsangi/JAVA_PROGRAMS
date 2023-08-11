
//import java.text.DecimalFormat;
import java.util.Scanner;
public class _2104213_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("");
        String input = scanner.nextLine().trim();

        char unit = Character.toUpperCase(input.charAt(0));
        double temperature = Double.parseDouble(input.substring(2));

        if (unit == 'C') {
            double fahrenheit = celsiusToFahrenheit(temperature);
            System.out.printf("%.1f\n", fahrenheit);
        } else if (unit == 'F') {
            double celsius = fahrenheitToCelsius(temperature);
            System.out.printf("%.1f\n", celsius);
        } else {
            System.out.println("Invalid input! Please enter a valid temperature followed by C or F.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}
/*
Output:
Enter temperature (Example: C 37 or F 98.6): C 37
98.6 */