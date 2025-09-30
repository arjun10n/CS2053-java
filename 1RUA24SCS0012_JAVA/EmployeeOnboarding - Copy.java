import java.util.Scanner;

public class EmployeeOnboarding {

    public static void main(String[] args) {
        // Check if command-line arguments are passed
        if (args.length > 0) {
            processBatchUpdates(args);
        } else {
            collectEmployeeInfo();
        }
    }

    // Method to collect employee info
    public static void collectEmployeeInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee ID:");
        String empId = scanner.nextLine();

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine().trim();  // Trim any extra spaces

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine().trim();

        System.out.println("Enter Job Title:");
        String jobTitle = scanner.nextLine().trim();

        System.out.println("Enter Department:");
        String department = scanner.nextLine().trim();

        System.out.println("Enter Email Address:");
        String email = scanner.nextLine().trim().toLowerCase(); // Ensure email is in lowercase

        // Perform string formatting
        firstName = capitalize(firstName);
        lastName = capitalize(lastName);

        // Display the employee information
        System.out.println("\nEmployee Onboarded:");
        System.out.println("ID: " + empId);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
    }

    // Method to capitalize the first letter of a string
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    // Method to process batch updates via command-line arguments
    public static void processBatchUpdates(String[] args) {
        System.out.println("Processing Batch Updates...");

        for (String arg : args) {
            // Example format of batch update: empId,jobTitle,department
            String[] employeeUpdate = arg.split(",");
            if (employeeUpdate.length == 3) {
                String empId = employeeUpdate[0];
                String jobTitle = employeeUpdate[1];
                String department = employeeUpdate[2];

                // Update logic (simulated)
                System.out.println("Updating Employee ID " + empId);
                System.out.println("New Job Title: " + jobTitle);
                System.out.println("New Department: " + department);
            } else {
                System.out.println("Invalid batch update format for: " + arg);
            }
        }
    }
}
