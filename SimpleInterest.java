import java.util.Scanner;

public class SimpleInterest {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the principal amount
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        // Prompt the user for the interest rate
        System.out.print("Enter the interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        // Prompt the user for the time period (in years)
        System.out.print("Enter the time period (in years): ");
        double time = scanner.nextDouble();

        // Calculate the simple interest using the formula
        double simpleInterest = (principal * rate * time) / 100;

        // Display the result
        System.out.println("The simple interest is: " + simpleInterest);

        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
