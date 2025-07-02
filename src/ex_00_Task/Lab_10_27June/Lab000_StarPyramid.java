package ex_00_Task.Lab_10_27June;

public class Lab000_StarPyramid
{
    public static void main(String[] args) {
        int rows = 3; // Number of rows in the pyramid

        for (int i = 1; i <= rows; i++)
        {
            // Print spaces
            for (int j = i; j < rows; j++)
            {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++)
            {
                System.out.print("*");
            }

            // Move to next line
            System.out.println();
        }
    }
}
