package ex_00_Task.Lab_17_11July;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Task_4_FindanElementinArrayList
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("Mumbai");
        al.add("delhi");
        al.add("Pune");

        System.out.println(al);

            if(al.contains("Pune"))
            {
                System.out.println("Pune is in the list.");
            }
            else
            {
                System.out.println("Pune is Not in the list.");
            }

    }
}
