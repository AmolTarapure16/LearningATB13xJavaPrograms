package ex_00_Task.Lab_14_7July;

public class Lab_8_InterfaceConstants
{
    public static void main(String[] args)
    {
      Car1 mycar = new Car1();
      mycar.showSpeedLimit();
    }
}

// Interface with a constant
interface SpeedLimit
{
    int MAX_SPEED = 120; // implicitly public, static, and final
}

// Class accessing the interface constant
class Car1 implements SpeedLimit
{
    void showSpeedLimit()
    {
        System.out.println("Max Speed is: " + MAX_SPEED);
    }
}