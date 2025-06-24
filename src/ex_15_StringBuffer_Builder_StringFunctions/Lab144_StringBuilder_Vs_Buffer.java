package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab144_StringBuilder_Vs_Buffer
{
    public static void main(String[] args) {
        String s0= "Amol";
        String s1  = new String("Amol Tarapure");

        StringBuffer stringBuffer = new StringBuffer("java");
        StringBuilder stringBuilder = new StringBuilder("Java Programming");

        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
    }
}
