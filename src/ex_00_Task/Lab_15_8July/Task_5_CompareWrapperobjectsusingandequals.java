package ex_00_Task.Lab_15_8July;

public class Task_5_CompareWrapperobjectsusingandequals
{
    public static void main(String[] args)
    {
        // Values between -128 and 127 are cached in Integer pool
        Integer a = 100;
        Integer b = 100;

        // Values outside of -128 to 127 are not cached
        Integer c = 200;
        Integer d = 200;

        // Compare using ==
        System.out.println("a == b: " + (a == b));  // true due to caching
        System.out.println("c == d: " + (c == d));  // false (different objects)

        // Compare using equals()
        System.out.println("a.equals(b): " + a.equals(b));  // true
        System.out.println("c.equals(d): " + c.equals(d));  // true

    }
}
