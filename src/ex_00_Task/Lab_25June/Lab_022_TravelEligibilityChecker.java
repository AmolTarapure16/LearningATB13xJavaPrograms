package ex_00_Task.Lab_25June;

import java.util.Scanner;

public class Lab_022_TravelEligibilityChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input Age
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Input Visa Status
        System.out.print("Enter your visa status (valid/invalid): ");
        String visaStatus = sc.nextLine().trim().toLowerCase();

        // Validation & Eligibility Check
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else if (age < 18) {
            System.out.println("You must be at least 18 years old to travel.");
        } else if (!visaStatus.equals("valid") && !visaStatus.equals("invalid")) {
            System.out.println("Invalid visa status input. Please enter 'valid' or 'invalid'.");
        } else if (age >= 18 && visaStatus.equals("valid")) {
            System.out.println("✅ You are eligible to travel.");
        } else {
            System.out.println("❌ You are not eligible to travel.");
        }

        sc.close();
    }
}
