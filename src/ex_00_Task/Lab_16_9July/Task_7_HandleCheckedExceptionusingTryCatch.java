package ex_00_Task.Lab_16_9July;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task_7_HandleCheckedExceptionusingTryCatch
{
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistentfile.txt");
            System.out.println("File opened successfully.");
        } catch (FileNotFoundException e)
        {
            System.out.println("FileNotFoundException: The specified file was not found.");
        }

        System.out.println("Program continues after handling checked exception.");
    }
}
