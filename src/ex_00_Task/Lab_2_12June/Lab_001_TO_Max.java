package ex_00_Task.Lab_2_12June;

public class Lab_001_TO_Max
{
    public static void main(String[] args) {
        // Program 1: Find Max of Two Numbers using Ternary Operators.
        // Description: Uses ternary operator to compare a and b and print
        // the maximum value.A =10, B= 20;

        int x = 10;
        int y = 20;

        // System.out.println(Math.max(x,y));

        int max = x > y ? x : y;
        System.out.println(max);

    }
}
