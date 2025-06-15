package ex_00_Task.Lab_13June;

public class Lab_003_IDO_Program_3
{
    public static void main(String[] args) {
       // Program 3:
        int x = 5;
        System.out.println(x++ + ++x); // ?

        // A + B
        // A -> x++ -> ExpA -> 5 , a =6
        // +
        // B -> ++x -> ExpA -> 5 , b =6

        // Line No. |  a |  Exp
        // 7 | 5 | 6 |
        // 8 | 6 | 6+6 -> 12

    }
}
