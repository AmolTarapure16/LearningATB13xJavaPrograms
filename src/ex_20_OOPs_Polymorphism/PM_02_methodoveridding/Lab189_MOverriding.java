package ex_20_OOPs_Polymorphism.PM_02_methodoveridding;

public class Lab189_MOverriding
{
    public static void main(String[] args)
    {
     Dog d1 = new Dog();
     d1.sound();
    }
}

class Animal
{
    void sound(){
        System.out.println("Default Sound!");
    }

}

class Dog extends Animal
{
    @Override
    void sound(){
        System.out.println("Bark!!");
    }
}