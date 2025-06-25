package ex_16_Arrays;

public class Lab150_Arrays
{
    public static void main(String[] args) {
        int [] marks = { 1,2,3,4,5,6};

        // 2nd way to create the array

        int [] marks2 =  new int[5];  // Fixed Size , 5, index 0 to 4
        String [] name = new String[3];  // Fixed Size  3, index 0 to 2

        name[0]="Amol";
        name[1]="Dipali";
        name[2]="Kiyansh";

        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

    //    System.out.println(name[]);


    }

}
