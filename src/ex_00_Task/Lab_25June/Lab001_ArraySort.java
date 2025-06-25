package ex_00_Task.Lab_25June;

import java.util.Arrays;

public class Lab001_ArraySort
{
    public static void main(String[] args)
    {
        int [] numbers = {1,30,25,15,11,6,8,2};

        Arrays.sort(numbers);

        System.out.println("Sorted Array");

        for(int num : numbers)
        {
            System.out.println(num);
        }

    }

}
