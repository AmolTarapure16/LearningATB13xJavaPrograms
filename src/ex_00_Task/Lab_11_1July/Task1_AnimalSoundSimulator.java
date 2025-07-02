package ex_00_Task.Lab_11_1July;

public class Task1_AnimalSoundSimulator
{
    public static void main(String[] args)
    {
     Cat c = new Cat();
     c.makeSound();
     c.meow();
    }
}

class Animal
{
    void makeSound()
    {
        System.out.println("Animal Make sound");
    }
}
class Cat extends Animal
{
    void meow()
    {
        System.out.println("Cat Meow");
    }
}