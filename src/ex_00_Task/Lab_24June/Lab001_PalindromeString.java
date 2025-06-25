package ex_00_Task.Lab_24June;

import java.util.Scanner;

public class Lab001_PalindromeString
{
    public static void main(String[] args)
    {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.next();

    //    String newStringreverse = reverseStringSB (input);
        String newStringreverse = reverseString (input);

        if (newStringreverse.equalsIgnoreCase(input))
        {
            System.out.println("Palindrom");
        }
        else
        {
            System.out.println("Not Palindrom");
        }


    }

    static String reverseString(String userInput)
    {
        String reversed = "";
        for (int i = userInput.length()-1; i >= 0 ; i--) {
            reversed = reversed+ userInput.charAt(i);
        }
        return reversed;
    }

    static String reverseStringSB(String userInput)
    {
        StringBuilder stringBuilder= new StringBuilder(userInput);
        return stringBuilder.reverse().toString();
    }



}
