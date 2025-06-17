package ex_00_Task.Lab_17June;

import java.util.Scanner;

public class Lab_001_IQ_Factorial
{
    public static void main(String[] args)
    {
        // Factorial Program = n!=n×(n−1)×(n−2)×⋯×1
        //5! = 5 × 4 × 3 × 2 × 1 = 120

        Scanner scanner= new Scanner(System.in);
        System.out.println("Welcome to the Factorial Program \n Enter the number!" );

                if(! scanner.hasNextInt())
                {
                    System.out.println("Enter the int you fool!");
                    return;
                }
        int number = scanner.nextInt();
        long factorial =1;

                if(number<0)
                {
                    System.out.println("Negative Factorial is not allowed!");
                    return;
                }
        if(number<=0)
        {
            System.out.println(factorial);
        }
        else
        {
            for(int i=1;i<=number;i++)
            {
                factorial=factorial*i;
            }
        }
        System.out.println("Factorial is -> " + factorial); // Print the calculated factorial

    }
}
