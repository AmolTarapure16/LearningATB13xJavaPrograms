package ex_00_Task.Lab_19_15July;

import java.util.*;

public class Program_8_FindMostFrequentCharacterinString
{
    public static void main(String[] args)
    {
        // Input string
        String input = "aaaabbbcc";

        // HashMap to store frequency of characters
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count frequency of each character
        for (char ch : input.toCharArray())
        {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Variables to store the most frequent character and its count
        char mostFrequentChar = ' ';
        int maxCount = 0;

        // Find the character with the highest frequency
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet())
        {
            if (entry.getValue() > maxCount)
            {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Output result
        System.out.println("Most frequent character is: " + mostFrequentChar + " (" + maxCount + " times)");
    }
}
