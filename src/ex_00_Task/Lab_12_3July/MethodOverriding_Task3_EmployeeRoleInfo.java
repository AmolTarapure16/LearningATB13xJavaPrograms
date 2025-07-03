package ex_00_Task.Lab_12_3July;

public class MethodOverriding_Task3_EmployeeRoleInfo
{
    public static void main(String[] args)
    {

        Employee employee = new Employee();
        employee.role();

        Manager manager =new Manager();
        manager.role();

        Clerk clerk = new Clerk();
        clerk.role();

        Tester tester = new Tester();
        tester.role();

    }
}

class Employee
{
    void role()
    {
        System.out.println("General Employee");
    }
}

class Manager extends Employee
{
    @Override
    void role()
    {
        System.out.println("Manager");
    }
}

class Clerk extends Employee
{
    @Override
    void role()
    {
        System.out.println("Clerk");
    }
}

class Tester extends Employee
{
    @Override
    void role()
    {
        System.out.println("Tester");
    }
}