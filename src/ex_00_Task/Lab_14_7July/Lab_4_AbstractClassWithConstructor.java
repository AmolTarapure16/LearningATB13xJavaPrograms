package ex_00_Task.Lab_14_7July;

public class Lab_4_AbstractClassWithConstructor
{
    public static void main(String[] args)
    {
        ConcreteClass obj = new ConcreteClass();
        obj.display();
    }
}

// Abstract class with constructor
abstract class AbstractExample
{
    // Constructor
    AbstractExample()
    {
        System.out.println("Abstract class constructor called");
    }

    // Concrete method
    void display()
    {
        System.out.println("Method from abstract class");
    }
}

// Concrete subclass
class ConcreteClass extends AbstractExample
{
    // No need to define constructor unless needed
}