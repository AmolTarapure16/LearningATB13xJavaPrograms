package ex_00_Task.Lab_12_3July;

public class MethodOverloading_Task4_GreetUser
{
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        greeter.greet();
        greeter.greet("Amol");
    }
}

class Greeter
{
    String greet() {
        return "Hello!";
    }

    String greet(String name) {
        System.out.println("Hello, " +name+ " !");
        return name;
    }
}