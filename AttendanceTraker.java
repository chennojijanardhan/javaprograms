import java.util.Scanner;

public class AttendanceTraker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the number of employees
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        
        // Create a 2D array to store attendance for n employees over 7 days
        String[][] attendance = new String[n][7];

        // Loop to input attendance for each employee over the week
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter attendance for Employee " + (i + 1) + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Day " + (j + 1) + " (Present/Absent): ");
                attendance[i][j] = scanner.next();
            }
        }

        // Display the attendance of all employees
        System.out.println("\nAttendance Report for the Week:");
        System.out.println("Employee | Day 1 | Day 2 | Day 3 | Day 4 | Day 5 | Day 6 | Day 7");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.print("Employee " + (i + 1) + " | ");
            for (int j = 0; j < 7; j++) {
                System.out.print(attendance[i][j] + " | ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
