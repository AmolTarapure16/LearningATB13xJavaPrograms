package ex_00_Task.Lab_25June;

import java.util.Scanner;

public class Lab_018_LoanEligibilityChecker
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your Credit Score: ");
        int creditScore = sc.nextInt();

        // Age validation
        if (age <= 0) {
            System.out.println("Invalid age. Age must be a positive number.");
        } else if (age < 18) {
            System.out.println("You are too young for a loan.");
        } else if (age > 80) {
            System.out.println("You are too old for a loan.");
        }
        // Salary validation
        else if (salary <= 0) {
            System.out.println("Invalid salary. Salary must be a positive number.");
        } else if (salary < 30000) {
            System.out.println("Your salary is too low for loan eligibility.");
        }
        // Credit score validation
        else if (creditScore <= 0) {
            System.out.println("Invalid credit score. Must be a positive integer.");
        } else if (creditScore < 650) {
            System.out.println("Your credit score is too low for loan eligibility.");
        } else if (creditScore > 850) {
            System.out.println("Invalid credit score. Maximum allowed is 850.");
        }
        // If all conditions pass
        else {
            System.out.println("✅ You are eligible for a loan!");
        }

        sc.close();
    }
}
