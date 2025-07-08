package ex_00_Task.Lab_15_8July;

public class Task_3_ConvertinttoIntegerusingAutoboxing
{
    public static void main(String[] args)
    {
        // Declare a primitive int
        int primitiveValue = 10;
        System.out.println("Primitive value: " + primitiveValue);

        // Autoboxing: convert int to Integer
        Integer wrapperObject = primitiveValue;
        System.out.println("Wrapper object: " + wrapperObject);
    }
}
