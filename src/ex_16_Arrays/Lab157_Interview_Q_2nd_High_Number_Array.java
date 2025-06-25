package ex_16_Arrays;

import java.util.Arrays;

public class Lab157_Interview_Q_2nd_High_Number_Array
{
    public static void main(String[] args) {
        // Find Second Largest Number in an Array
        int [] number = {12, 34, 10, 1, 100, 3, 4, 32};

        Arrays.sort(number);

        System.out.println(number[number.length-2]);

    }
}
