package ex_00_Task.Lab_17_11July;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task_5_CompareArrayListvsLinkedListPerformance
{
    public static void main(String[] args)
    {
        // ArrayList performance test
        List<Integer> arrayList = new ArrayList<>();
        long startArrayList = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            arrayList.add(i);
        }

        long endArrayList = System.currentTimeMillis();
        System.out.println("ArrayList time: " + (endArrayList - startArrayList) + " ms");

        // LinkedList performance test
        List<Integer> linkedList = new LinkedList<>();
        long startLinkedList = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }

        long endLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList time: " + (endLinkedList - startLinkedList) + " ms");

    }
}
