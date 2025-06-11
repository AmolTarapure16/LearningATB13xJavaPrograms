package ex_04_Operators;

public class Lab040_Relational_Operators
{
    public static void main(String[] args) {
        // < Less Than
        // < =  -> Less than or equal to
        // > Greater
        // > = Greater or equal
        // == ->  Equal to (but checking)
        // != -> Not equal

        // All of them will result boolean output.

        int a = 10;
        int b = 30;
        boolean c = a > b; // 10 >30
        System.out.println(c);

        int age_dipali = 30;
        int age_amol = 35;
        boolean result = age_amol >= age_dipali;
        System.out.println(result);

        // age_pramod > age_dipali or age_amol = age_mamitha
    }
}
