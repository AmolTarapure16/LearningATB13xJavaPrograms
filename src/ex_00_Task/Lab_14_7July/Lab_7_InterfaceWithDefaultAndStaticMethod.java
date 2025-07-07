package ex_00_Task.Lab_14_7July;

public class Lab_7_InterfaceWithDefaultAndStaticMethod
{
    public static void main(String[] args)
    {
        Car myCar = new Car();
        myCar.start();              // Calls default method from interface
        Vehicle.fuelType();         // Calls static method from interface directly

    }
}

// Interface with default and static methods
interface Vehicle
{
    // Default method
    default void start()
    {
        System.out.println("Vehicle started");
    }

    // Static method
    static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }
}

// Class implementing the interface
class Car implements Vehicle
{
    // No need to override start() unless customization is needed
}