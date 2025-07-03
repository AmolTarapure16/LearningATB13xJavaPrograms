package ex_00_Task.Lab_12_3July;

public class MethodOverloading_Task2_PrintData
{
    public static void main(String[] args) {

        Printer p1 = new Printer();
        p1.printData(10);
        p1.printData(20f);
        p1.printData("Amol");


    }
}
class Printer
{
    String printData(String data)
    {
        System.out.println(data);
        return data;
    }

    int printData(int data)
    {
        System.out.println(data);
        return data;
    }

    float printData(float data)
    {
        System.out.println(data);
        return data;
    }
}