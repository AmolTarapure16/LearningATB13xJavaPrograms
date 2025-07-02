package ex_00_Task.Lab_8_24June;

import java.util.Scanner;

public class Lab_014_ATMWithdrawal
{
    public static void main(String[] args)
    {
        int balance = 10000;  // Step 1: Initialize account balance
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount you want to withdraw: ");
        int amount = scanner.nextInt();  // Step 2: Take input from user

        // Step 3: Check withdrawal conditions
        if (amount <= 0) {
            System.out.println("❌ Withdrawal amount must be greater than zero.");
        } else if (amount % 100 != 0) {
            System.out.println("❌ Withdrawal amount must be a multiple of 100.");
        } else if (amount > balance) {
            System.out.println("❌ Insufficient balance. Your current balance is ₹" + balance);
        } else {
            // Step 4: Deduct amount and update balance
            balance -= amount;
            // Step 5: Show updated balance
            System.out.println("✅ Withdrawal successful!");
            System.out.println("💰 Updated balance: ₹" + balance);
        }
    }
}
