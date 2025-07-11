package ex_00_Task.Lab_17_11July;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task_1_AddandDisplayElementsinArrayList
{
    public static void main(String[] args)
    {
        List al = new ArrayList();
        al.add("Dipak");
        al.add("Ravi");
        al.add("Sneha");
        al.add("Priya");
        al.add("Anjali");

        System.out.println(al);

        for(int i=0; i<al.size();i++)
        {
            System.out.println(al.get(i));

        }

        System.out.println("---------");

        Iterator iterator = al.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
