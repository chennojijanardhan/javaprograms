import java.util.Scanner;

public class BankTransactionHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the balance
        double balance = 0.0;
        int choice;

        // Start the do-while loop for bank transactions
        do {
            // Display the menu
            System.out.println("\nBank Transaction Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Quit");
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.printf("You have successfully deposited $%.2f\n", depositAmount);
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount > 0 && withdrawAmount <= balance) {
                        balance -= withdrawAmount;
                        System.out.printf("You have successfully withdrawn $%.2f\n", withdrawAmount);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds. Try a smaller amount.");
                    } else {
                        System.out.println("Invalid amount. Please enter a positive value.");
                    }
                    break;

                case 3:
                    // Check balance
                    System.out.printf("Your current balance is: $%.2f\n", balance);
                    break;

                case 4:
                    // Quit the program
                    System.out.println("Thank you for using our banking service. Goodbye!");
                    break;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
        } while (choice != 4); // Continue until user chooses to quit

        scanner.close();
    }
}
