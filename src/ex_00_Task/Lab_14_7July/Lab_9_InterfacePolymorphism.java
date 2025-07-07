package ex_00_Task.Lab_14_7July;

public class Lab_9_InterfacePolymorphism
{
    public static void main(String[] args)
    {
        Playable instrument;  // Interface reference

        instrument = new Guitar();  // Refers to Guitar object
        instrument.play();          // Output: Playing Guitar

        instrument = new Piano();   // Refers to Piano object
        instrument.play();          // Output: Playing Piano

    }
}

interface Playable
{
    void play();
}

// Class 1 implementing the interface
class Guitar implements Playable
{
    @Override
    public void play()
    {
        System.out.println("Playing Guitar");
    }
}

// Class 2 implementing the interface
class Piano implements Playable
{
    @Override
    public void play()
    {
        System.out.println("Playing Piano");
    }
}