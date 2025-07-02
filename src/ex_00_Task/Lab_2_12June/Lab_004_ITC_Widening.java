package ex_00_Task.Lab_2_12June;

public class Lab_004_ITC_Widening
{
    public static void main(String[] args) {
        //Program 4: Implicit Typecasting (Widening)
        //Description: Convert int A =100 to double.

        int A = 100;          // Integer value
        double B = A;         // Implicitly casted to double

        System.out.println("Integer value (A): " + A);
        System.out.println("Double value (B): " + B);
    }
}
