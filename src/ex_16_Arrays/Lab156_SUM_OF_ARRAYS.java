package ex_16_Arrays;

public class Lab156_SUM_OF_ARRAYS
{
    public static void main(String[] args) {

        int[] numbers  = {1,2,3,4,5};
        int sum = 0;

        for(int i=0;i<numbers .length;i++)
        {
            sum= sum + numbers[i];
        }
        System.out.println(sum + " Sum of Array");
    }
}
