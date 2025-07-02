package ex_00_Task.Lab_9_25June;

import java.util.Scanner;

public class Lab_016_PalindromeNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int original = num;
        int reverse = 0;

        // Step 2: Reverse the number
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num = num / 10;
        }

        // Step 3: Check if palindrome
        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is Not a Palindrome Number.");
        }
    }
}
