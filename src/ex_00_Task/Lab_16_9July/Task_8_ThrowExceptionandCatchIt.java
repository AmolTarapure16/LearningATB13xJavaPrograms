package ex_00_Task.Lab_16_9July;

public class Task_8_ThrowExceptionandCatchIt
{
    public static void main(String[] args)
    {
        try
        {
            // Manually throwing an exception
            throw new ArithmeticException("Manual arithmetic exception thrown!");
        } catch (ArithmeticException e)
        {
            System.out.println("Caught manually thrown exception: " + e.getMessage());
        }

        System.out.println("Program continues after manual throw and catch.");
    }
}
