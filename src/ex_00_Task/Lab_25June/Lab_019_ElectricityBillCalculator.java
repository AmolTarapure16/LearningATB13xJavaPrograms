package ex_00_Task.Lab_25June;

import java.util.Scanner;

public class Lab_019_ElectricityBillCalculator
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input units consumed
        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();

        double bill = 0;

        if (units <= 0) {
            System.out.println("Invalid input. Units must be positive.");
        } else {
            if (units <= 100) {
                bill = units * 0.50;
            } else if (units <= 200) {
                bill = (100 * 0.50) + ((units - 100) * 0.75);
            } else if (units <= 300) {
                bill = (100 * 0.50) + (100 * 0.75) + ((units - 200) * 1.20);
            } else {
                bill = (100 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 300) * 1.50);
            }

            System.out.printf("Total Electricity Bill: ₹%.2f%n", bill);
        }

        sc.close();
    }
}
