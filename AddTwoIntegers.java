import java.util.Scanner;

public class AddTwoIntegers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first integer
        System.out.print("Enter the first integer: ");
        double num1 = scanner.nextDouble();

        // Prompt the user for the second integer
        System.out.print("Enter the second integer: ");
        double num2 = scanner.nextDouble();

        // Add the two integers
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        // Close the scanner object
        scanner.close();
    }
}
