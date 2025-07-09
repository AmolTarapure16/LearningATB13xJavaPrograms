package ex_00_Task.Lab_16_9July;

public class Task_1_BasicTryCatchwithArithmeticException
{
    public static void main(String[] args)
    {
        int number = 10;
        int result;

        try
        {
            result = number / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("Cannot divide by zero. Please check your arithmetic operation.");
        }

    }
}
