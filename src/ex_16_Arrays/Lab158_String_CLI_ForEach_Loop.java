package ex_16_Arrays;

public class Lab158_String_CLI_ForEach_Loop
{
    public static void main(String[] amol) {

        // 10 amol true


        for (int i = 0; i < amol.length; i++) {
            System.out.println(amol[i]);
        }

        System.out.println(" -- ");

        for(String arg:amol){
            System.out.println(arg);
        }
    }
}
