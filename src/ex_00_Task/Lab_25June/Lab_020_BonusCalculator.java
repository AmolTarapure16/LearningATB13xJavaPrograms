package ex_00_Task.Lab_25June;

import java.util.Scanner;

public class Lab_020_BonusCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of experience
        System.out.print("Enter your Salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your Years of Experience: ");
        double years = sc.nextDouble();

        double bonus = 0;

        if (salary <= 0) {
            System.out.println("Invalid salary. Salary must be a positive number.");
        } else if (years < 0) {
            System.out.println("Invalid experience. Years cannot be negative.");
        } else {
            // Calculate bonus based on years of experience
            if (years < 1) {
                bonus = 0;
            } else if (years >= 1 && years <= 3) {
                bonus = salary * 0.05;
            } else if (years >= 4 && years <= 6) {
                bonus = salary * 0.10;
            } else {
                bonus = salary * 0.15;
            }

            System.out.printf("Your bonus is: ₹%.2f%n", bonus);
        }

        sc.close();
    }
}
