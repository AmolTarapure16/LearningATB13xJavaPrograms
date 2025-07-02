package ex_00_Task.Lab_7_23June;

import java.util.Scanner;

public class Lab_005_EligibleToVote
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = scanner.nextInt();

        if (age>=18)
        {
            System.out.println("Eligible To Vote");
        }else {
            System.out.println("Not Eligible To Vote");
        }
    }
}
