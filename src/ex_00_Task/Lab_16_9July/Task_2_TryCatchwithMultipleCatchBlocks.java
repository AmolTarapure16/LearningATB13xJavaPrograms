package ex_00_Task.Lab_16_9July;

public class Task_2_TryCatchwithMultipleCatchBlocks
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30};
        int result = 0;

        try {
            // Change these lines to test different exceptions:
            result = numbers[5] / 0;  // May cause ArrayIndexOutOfBoundsException and ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e)
        {
            System.out.println("ArithmeticException occurred: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurred: Invalid array index.");
        }
    }
}
