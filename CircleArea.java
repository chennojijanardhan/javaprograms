import java.util.Scanner;

public class CircleArea {

    public static void main(String[] args) {
        // Create a Scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Define the value of pi
        double pi = Math.PI;

        // Calculate the circumference of the circle
        double circumference = 2 * pi * radius;

        // Calculate the area of the circle
        double area = pi * radius * radius;

        // Display the results
        System.out.println("The circumference of the circle is: " + circumference);
        System.out.println("The area of the circle is: " + area);

        // Close the scanner object to avoid resource leak
        scanner.close();
    }
}
