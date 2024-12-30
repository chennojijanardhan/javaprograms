import java.util.Scanner;

public class TemperatureConversion {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to choose the conversion type
        System.out.println("Temperature Conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        // Perform the conversion based on the user's choice
        if (choice == 1) {
            // Celsius to Fahrenheit conversion
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsius * (9.0 / 5.0) + 32;
            System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        } else if (choice == 2) {
            // Fahrenheit to Celsius conversion
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * (5.0 / 9.0);
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        } else {
            System.out.println("Invalid choice! Please enter 1 or 2.");
        }

        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
