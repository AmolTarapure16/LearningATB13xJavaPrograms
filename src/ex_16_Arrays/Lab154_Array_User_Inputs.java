package ex_16_Arrays;

import java.util.Scanner;

public class Lab154_Array_User_Inputs
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array(int) only");

        int size = scanner.nextInt();

        int[] numbers_marks  = new int[size];

        for (int i=0; i< numbers_marks.length; i++)
        {
            System.out.println("Enter the numbers");
            numbers_marks [i]= scanner.nextInt();
        }

        System.out.println("-------Print------");

        for (int i=0; i<numbers_marks.length;i++)
        {
            System.out.println(numbers_marks[i]);
        }

    }
}
