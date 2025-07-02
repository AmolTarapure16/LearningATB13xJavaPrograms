package ex_00_Task.Lab_9_25June;

import java.util.Arrays;

public class Lab000_Second_High_Number_Array
{
    public static void main(String[] args)
    {
        int[] numbers = {12, 34, 10, 1};

        Arrays.sort(numbers);

        System.out.println("Second Largest Number: " + numbers[numbers.length - 2]);

    }
}
