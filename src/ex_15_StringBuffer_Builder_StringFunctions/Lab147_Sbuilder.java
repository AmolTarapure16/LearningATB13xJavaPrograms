package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab147_Sbuilder
{
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("I love java");
        stringBuilder.append(2025);

        stringBuilder.reverse();

        System.out.println(stringBuilder);
    }
}
