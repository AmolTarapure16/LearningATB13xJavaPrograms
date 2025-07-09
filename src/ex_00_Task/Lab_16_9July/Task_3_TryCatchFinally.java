package ex_00_Task.Lab_16_9July;

public class Task_3_TryCatchFinally
{
    public static void main(String[] args)
    {
        int num = 10;
        int result = 0;

        try {
            result = num / 0; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("Caught an ArithmeticException: Cannot divide by zero.");
        } finally
        {
            System.out.println("Finally block executed: Cleaning up resources or finishing tasks.");
        }
        System.out.println("Program continues after try-catch-finally.");
    }
}
