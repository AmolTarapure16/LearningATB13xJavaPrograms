package ex_00_Task.Lab_16_9July;

public class Task_6_CatchSpecificvsGenericException
{
    public static void main(String[] args)
    {
        System.out.println("First Run: Specific catch (NullPointerException)");
        try {
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (NullPointerException e)
        {
            System.out.println("Caught specifically: " + e);
        }

        System.out.println("\n Second Run: Generic catch (Exception)");
        try {
            String str = null;
            System.out.println(str.length()); // Throws NullPointerException
        } catch (Exception e)
        {
            System.out.println(" Caught generically: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }

        System.out.println("\n Program continues after both try-catch blocks.");

    }
}
