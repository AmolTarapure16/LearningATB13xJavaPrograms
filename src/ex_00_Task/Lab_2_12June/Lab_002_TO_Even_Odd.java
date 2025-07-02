package ex_00_Task.Lab_2_12June;

public class Lab_002_TO_Even_Odd
{
    public static void main(String[] args)
    {
        //Program 2: Check Even or Odd.
        //Description: Uses ternary to check whether a number is even or odd. A = 19,
        // update the a value and check again A =20;

        int num = 12;
        String result  = (num%2 == 0) ? "Even" : "Odd";
        System.out.println(result);
    }
}
