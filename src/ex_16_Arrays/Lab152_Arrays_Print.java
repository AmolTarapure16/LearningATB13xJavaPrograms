package ex_16_Arrays;


import java.util.Arrays;

public class Lab152_Arrays_Print
{
    public static void main(String[] args) {

        int [] marks = {25,6,12,15,8,7,3,2,9};

        for (int i = 0; i <marks.length ; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("-------Sotring---------");
        Arrays.sort(marks);

        for (int i = 0; i < marks.length ; i++)
        {
            System.out.println(marks[i]);
        }


    }
}
