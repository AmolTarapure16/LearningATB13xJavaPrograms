package ex_00_Task.Lab_12_3July;

public class MethodOverloading_Task1_AddTwoNumbers
{
    public static void main(String[] args)
    {

        Calculator c1 = new Calculator();
        c1.add(10,20);
        c1.add(10.20,30.20);
    }
}

class Calculator
{
    int add(int a, int b)
    {
        System.out.println(a+b);
        return a+b;
    }

    double add(double a, double b)
    {
        System.out.println(a+b);
        return a+b;
    }
}