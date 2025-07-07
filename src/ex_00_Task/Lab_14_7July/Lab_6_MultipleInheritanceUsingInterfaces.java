package ex_00_Task.Lab_14_7July;

public class Lab_6_MultipleInheritanceUsingInterfaces
{
    public static void main(String[] args)
    {
        Document doc = new Document();
        doc.print();
        doc.show();
    }
}

// First interface
interface Printable
{
    void print();
}

// Second interface
interface Showable
{
    void show();
}

// Class implementing both interfaces
class Document implements Printable, Showable
{
    // Implementing print() from Printable
    public void print()
    {
        System.out.println("Printing Document");
    }

    // Implementing show() from Showable
    public void show()
    {
        System.out.println("Showing Document");
    }
}
