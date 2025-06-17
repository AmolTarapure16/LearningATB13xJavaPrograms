package ex_00_Task.Lab_17June;

public class Lab_003_VowelConsonantCounter
{
    public static void main(String[] args)
    {
    String input = "Hello World!";
    int vowelCount = 0;
    int consonantCount = 0;

    input = input.toLowerCase();

    for(int i=0;i<input.length();i++)
    {
       char ch= input.charAt(i);

       if(Character.isLetter(ch))
       {
           if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           {
               vowelCount++;
           }
           else
           {
               consonantCount++;
           }
       }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    }
}
