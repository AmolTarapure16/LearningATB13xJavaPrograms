package ex_12_DoWhile;
import java.util.Scanner;

public class CP_checkVowel
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter single char : ");
        char ch = scanner.next().toLowerCase().charAt(0);

        switch (ch){
            case 'a','e','i','o','u' -> System.out.println("vowel");
            default -> System.out.println("consonants");
        }




    }
}
