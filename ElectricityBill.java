import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the units of electricity consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double billAmount;

        // Calculate the bill using if-else statements
        if (units <= 100) {
            billAmount = units * 1.0; // $1 per unit for 0-100 units
        } else if (units <= 200) {
            billAmount = 100 * 1.0 + (units - 100) * 2.0; // $1 per unit for first 100, $2 per unit for next 100
        } else {
            billAmount = 100 * 1.0 + 100 * 2.0 + (units - 200) * 3.0; // $1 per unit for first 100, $2 per unit for next 100, $3 per unit for above 200
        }

        // Display the calculated bill amount
        System.out.println("Your electricity bill for " + units + " units is: $" + billAmount);

        scanner.close();
    }
}
