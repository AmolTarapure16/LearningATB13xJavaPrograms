package ex_00_Task.Lab_11_1July;

public class Task2_VehicleConstructorChain
{
    public static void main(String[] args)
    {
    Bike bike =new Bike();
    }
}


class Vehicle
{
    Vehicle()
    {
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle
{
   Bike()
   {
       System.out.println("Bike is ready");
   }
}