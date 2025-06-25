package ex_00_Task.Lab_24June;

import java.util.Scanner;

public class Lab_012_characterIsAnAlphabet
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Character : ");
        char ch = scanner.next().charAt(0);

        if((ch >= 'A' && ch <= 'Z')|| (ch>='a' && ch<='z') )
        {
            System.out.println(ch + " is an alphabet.");
        }
        else
        {
            System.out.println(ch + " is not an alphabet.");
        }

    }

}
