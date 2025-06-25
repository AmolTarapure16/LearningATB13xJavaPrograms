package ex_00_Task.Lab_23June;

import java.util.Scanner;

public class Lab_002_NumberEvenOrOdd
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = scanner.nextInt();

        if(num%2==0)
        {
            System.out.println("Even Num");
        }
        else
        {
            System.out.println("Odd Num");
        }

    }
}
