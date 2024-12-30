import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the first number (can be an integer or float)
        System.out.print("Enter the first number: ");
        // Read the first number as a double (supports both integers and floating-point values)
        double num1 = scanner.nextDouble();

        // Prompt the user for the second number (can be an integer or float)
        System.out.print("Enter the second number: ");
        // Read the second number as a double
        double num2 = scanner.nextDouble();

        // Add the two numbers
        double sum = num1 + num2;
        double subtract = num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;
        // Display the result
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("The subtrct of " + num1 + " and " + num2 + " is: " + subtract);
        System.out.println("The multiply of " + num1 + " and " + num2 + " is: " + multiply);
        System.out.println("The divide of " + num1 + " and " + num2 + " is: " + divide);

        // Close the scanner object
        scanner.close();
    }
}
