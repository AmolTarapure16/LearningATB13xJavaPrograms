package ex_00_Task.Lab_12_3July;

public class MethodOverriding_Task2_VehicleStart
{
    public static void main(String[] args)
    {
        Vehicle vehicle =new Vehicle();
        vehicle.start();

        Bike bike = new Bike();
        bike.start();

        Car car = new Car();
        car.start();

    }
}

class Vehicle
{
    void start()
    {
        System.out.println("Vehical Start");
    }
}

class Bike extends Vehicle
{
    @Override
    void start()
    {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle
{
    @Override
    void start()
    {
        System.out.println("Turn the key to start the car");
    }
}