package ex_00_Task.Lab_17_11July;

import java.util.ArrayList;
import java.util.Arrays;

public class Task_2_RemoveanElementfromArrayList
{
    public static void main(String[] args)
    {
       ArrayList <String> al = new ArrayList();
       al.add("Amit");
       al.add("Neha");
       al.add("Suresh");

       System.out.println(al);

       al.remove("Neha");

        System.out.println(al);
    }
}
