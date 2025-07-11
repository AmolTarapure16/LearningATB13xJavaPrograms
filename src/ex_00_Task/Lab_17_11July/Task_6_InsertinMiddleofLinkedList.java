package ex_00_Task.Lab_17_11July;

import java.util.LinkedList;

public class Task_6_InsertinMiddleofLinkedList
{
    public static void main(String[] args)
    {
        // Create LinkedList with initial fruits
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // Insert "Orange" at index 1
        fruits.add(1, "Orange");

        // Print the final list
        System.out.println("Fruits List: " + fruits);
    }
}
