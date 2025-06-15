package ex_00_Task.Lab_13June;

public class Lab_002_IDO_Program_2
{
    public static void main(String[] args) {
        // Program 2:
        int i = 1;
        i = i++ + ++i;
        System.out.println(i); // ?

        // A + B
        // A -> i++ -> ExpA -> 1 , a =2
        // +
        // B -> ++i -> ExpA -> 1 , b =2

        // Line No. |  a |  Exp
        // 7 | 1 | 2 |
        // 8 | 2 | 2+2 -> 4
    }
}
