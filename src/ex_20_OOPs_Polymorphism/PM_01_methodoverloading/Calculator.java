package ex_20_OOPs_Polymorphism.PM_01_methodoverloading;

public class Calculator
{
    public static void main(String[] args)
    {
          cal c1 = new cal();
         int r1 = c1.add(10,20);
         double r2= c1.add(2.2,3.3);

        System.out.println(r1);
        System.out.println(r2);
    }
}

class cal
{
    int add (int a, int b)
    {
        return a+b;
    }

    double add (double a, double b)
    {
        return a+b;
    }
}