package ex_20_OOPs_Polymorphism.PM_01_methodoverloading;

public class Lab188_REAL_MOverloading
{
    public static void main(String[] args)
    {
     Home h1 = new Home();
        h1.task();
        h1.task(10);
        h1.task(10.20);

    }
}

class Home{

    void task()
    {
        System.out.println("Home Task 1");
    }

    int task(int a)
    {
        System.out.println("Home Task 2");
        return a;
    }

    double task (double d)
    {
        System.out.println("Home Task 3");
        return d;
    }
}