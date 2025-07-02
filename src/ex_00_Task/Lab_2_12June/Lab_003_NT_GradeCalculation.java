package ex_00_Task.Lab_2_12June;

public class Lab_003_NT_GradeCalculation
{
    public static void main(String[] args)
    {
        // Program 3: Grade Calculation Using Nested Ternary
        //Description: Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail.
        //Syntax-> result = condition1 ? expression1 : (condition2 ? expression2 : expression3);

        int marks = 30;
        String grade  =   (marks >= 90) ? "A+"
                        : (marks >= 75) ? "A"
                        : (marks >= 60) ? "B"
                        : (marks >= 40) ? "C"
                        : "Fail";

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}
