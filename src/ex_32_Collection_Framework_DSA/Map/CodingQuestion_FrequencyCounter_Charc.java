package ex_32_Collection_Framework_DSA.Map;

import java.util.HashMap;
import java.util.Map;

public class CodingQuestion_FrequencyCounter_Charc
{
    public static void main(String[] args)
    {
        String input = "programming";

        Map<Character,Integer > freqmap = new HashMap<>();

        for(char c :input.toCharArray())
        {
            freqmap.put(c,freqmap.getOrDefault(c,0)+1);
        }
        System.out.println(freqmap);

    }
}
