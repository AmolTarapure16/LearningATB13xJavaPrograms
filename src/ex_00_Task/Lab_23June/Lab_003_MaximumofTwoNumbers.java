package ex_00_Task.Lab_23June;

import java.util.Scanner;

public class Lab_003_MaximumofTwoNumbers
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First num ");
        int a = scanner.nextInt();
        System.out.println("Enter Second num");
        int b = scanner.nextInt();

        if(a>b)
        {
            System.out.println(a + " is Maximum");
        }
        else
        {
            System.out.println(b + " is Maximum");
        }
    }
}
