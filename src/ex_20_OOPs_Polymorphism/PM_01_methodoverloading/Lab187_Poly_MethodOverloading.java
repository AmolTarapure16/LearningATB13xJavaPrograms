package ex_20_OOPs_Polymorphism.PM_01_methodoverloading;

public class Lab187_Poly_MethodOverloading
{
    public static void main(String[] args)
    {

        MathOperations mo = new MathOperations();
       int r1= mo.add(10,20);
       int r2= mo.add(10,20,30);
       double r3= mo.add(10.20,30.25);
       String s1= mo.add("Amol","Tarapure");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(s1);
    }
}

class MathOperations
{
    // In the same class, When you have a method wit same
    // Same name methods but different arguments and different return type.

    int add(int a, int b)
    {
        return a+b;
    }

    int add(int a, int b, int c)
    {
        return a+b+c;
    }

    double add(double a, double b)
    {
        return a+b;
    }
    String add(String a, String b)
    {
        return a+b;
    }



}