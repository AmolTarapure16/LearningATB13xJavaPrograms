package ex_00_Task.Lab_2_12June;

public class Lab_005_ETC_Narrowing
{
    public static void main(String[] args) {
        //Program 5: Explicit Typecasting (Narrowing)
        //Description: Casts a double to an int, cutting off decimals value.

        double A = 99.99;        // Double value
        int B = (int) A;         // Explicitly casted to int

        System.out.println("Double value (A): " + A);
        System.out.println("Integer value (B): " + B);  // Decimal part is cut off


    }
}
