package ex_00_Task.Lab_8_24June;

import java.util.Scanner;

public class Lab_008_SmallestofThreeNumbers
{
    public static void main(String[] args)
    {
        // Find the Smallest of Three Numbers.
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter the First No");
        int a = scanner.nextInt();
        System.out.println("Enter the Second No");
        int b = scanner.nextInt();
        System.out.println("Enter the Third No");
        int c = scanner.nextInt();

        if(a<b)
        {
            System.out.println(a + " First is Smallest");
        }
        else if(b<c)
        {
            System.out.println(b+ " Second is Smallest");
        }
        else
        {
            System.out.println(c+ " Third is Smallest");
        }
    }
}
