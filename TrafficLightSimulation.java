import java.util.Scanner;

public class TrafficLightSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the traffic light color
        System.out.print("Enter the traffic light color (Red, Yellow, Green): ");
        String lightColor = scanner.nextLine().trim(); // Read input and remove leading/trailing spaces

        // Use switch-case to handle different traffic light colors
        switch (lightColor.toLowerCase()) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Get Ready");
                break;

            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid input. Please enter Red, Yellow, or Green.");
        }

        scanner.close();
    }
}
