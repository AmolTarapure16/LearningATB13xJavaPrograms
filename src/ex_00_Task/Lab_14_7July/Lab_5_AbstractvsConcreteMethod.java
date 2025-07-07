package ex_00_Task.Lab_14_7July;

public class Lab_5_AbstractvsConcreteMethod
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.display(); // Calling concrete method
        obj.show();    // Calling implemented abstract method
    }
}

// Abstract class
abstract class Parent
{
    // Abstract method (no body)
    abstract void show();

    // Concrete method (has body)
    void display()
    {
        System.out.println("Concrete method in abstract class");
    }
}

// Concrete subclass
class Child extends Parent{
    // Implementing the abstract method
    @Override
    void show() {
        System.out.println("Abstract method implemented");
    }
}