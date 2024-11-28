import java.util.Scanner;

public class Temp{

    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the temperature value
        System.out.print("Enter the temperature value: ");
        double tempValue = scanner.nextDouble();

        // Prompt the user for the unit of measurement
        System.out.print("Enter the unit of measurement (C for Celsius, F for Fahrenheit): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        // Validate the unit of measurement
        if (unit != 'C' && unit != 'F') {
            System.out.println("Invalid unit. Please enter 'C' for Celsius or 'F' for Fahrenheit.");
            return; // Exit the program if the unit is invalid
        }

        // Perform the conversion
        if (unit == 'C') {
            // Convert Celsius to Fahrenheit
            double convertedTemp = (tempValue * 9/5) + 32;
            System.out.printf("%.2f°C is equal to %.2f°F.%n", tempValue, convertedTemp);
        } else if (unit == 'F') {
            // Convert Fahrenheit to Celsius
            double convertedTemp = (tempValue - 32) * 5/9;
            System.out.printf("%.2f°F is equal to %.2f°C.%n", tempValue, convertedTemp);
        }

        // Close the scanner
        scanner.close();
    }
}
