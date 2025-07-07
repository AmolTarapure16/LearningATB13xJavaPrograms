package ex_00_Task.Lab_14_7July;

public class Lab_1_AnimalSound
{
    public static void main(String[] args)
    {
          Animal dog = new Dog();
          dog.makeSound();

          Animal cat = new Cat();
          cat.makeSound();
    }
}

abstract class Animal
{
    abstract void makeSound();
}

class Dog extends Animal
{

    @Override
    void makeSound()
    {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal
{

    @Override
    void makeSound()
    {
        System.out.println("Cat meows");
    }
}