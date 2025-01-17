import java.util.Scanner;

public class DiscountCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the total price of items in the cart
        System.out.print("Enter the total price of items in your cart: $");
        double totalPrice = scanner.nextDouble();

        double finalPrice;

        // Apply discount based on total price
        if (totalPrice > 500) {
            // Apply 10% discount for total above $500
            finalPrice = totalPrice * 0.9;
            System.out.println("You qualify for a 10% discount!");
        } else if (totalPrice >= 200) {
            // Apply 5% discount for total between $200 and $500
            finalPrice = totalPrice * 0.95;
            System.out.println("You qualify for a 5% discount!");
        } else {
            // No discount for total below $200
            finalPrice = totalPrice;
            System.out.println("No discount applied.");
        }

        // Display the final price after applying any discount
        System.out.println("The final price after discount is: $" + finalPrice);

        scanner.close();
    }
}
