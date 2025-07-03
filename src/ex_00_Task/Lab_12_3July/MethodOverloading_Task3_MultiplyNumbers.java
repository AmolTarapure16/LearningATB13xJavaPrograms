package ex_00_Task.Lab_12_3July;

public class MethodOverloading_Task3_MultiplyNumbers
{
    public static void main(String[] args)
    {
        MathOperations mo =new MathOperations();
        mo.multiply(10,20);
        mo.multiply(10,20,30);
    }
}

class MathOperations
{
    int multiply(int a, int b)
    {
        int c= a*b;
        System.out.println(c);
        return c;
    }

    int multiply(int a, int b,int c)
    {
        int d= a*b*c;
        System.out.println(d);
        return d;
    }
}