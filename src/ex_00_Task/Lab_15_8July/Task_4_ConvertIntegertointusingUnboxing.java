package ex_00_Task.Lab_15_8July;

public class Task_4_ConvertIntegertointusingUnboxing
{
    public static void main(String[] args)
    {
        // Create an Integer object
        Integer wrapperObject = 20;
        System.out.println("Integer object: " + wrapperObject);

        // Unboxing: convert Integer to int
        int primitiveValue = wrapperObject;
        System.out.println("Unboxed primitive: " + primitiveValue);
    }
}
