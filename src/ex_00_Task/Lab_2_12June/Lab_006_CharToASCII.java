package ex_00_Task.Lab_2_12June;

public class Lab_006_CharToASCII
{
    public static void main(String[] args) {
        //Program 6: Character to ASCII
        //Description: Typecasts a character to its ASCII integer value.
        // Example Print A ASCII Int value.

        char ch = 'A';           // Character to convert
        int ascii = (int) ch;    // Typecast to int to get ASCII value

        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + ascii);
    }
}
