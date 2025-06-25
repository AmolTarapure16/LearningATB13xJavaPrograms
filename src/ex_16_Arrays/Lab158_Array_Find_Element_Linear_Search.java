package ex_16_Arrays;

public class Lab158_Array_Find_Element_Linear_Search
{
    public static void main(String[] args)
    {
        //Find the target 67, give index ?

    int [] number = {23, 43, 45, 67, 87, 90};

    int target = 67;

    for(int i=0; i<number.length;i++)
    {
        if (target == number[i])
        {
            System.out.println(i);
        }
    }

    }
}
