package ex_00_Task.Lab_12_3July;

public class MethodOverriding_Task4_LoginFunctionality
{
    public static void main(String[] args) {

        User user = new User();
        user.login();

        AdminUser adminUser = new AdminUser();
        adminUser.login();

        RegularUser regularUser = new RegularUser();
        regularUser.login();
    }
}

class User
{
    void login()
    {
        System.out.println("User login");
    }
}

class AdminUser extends User
{
    @Override
    void login()
    {
        System.out.println("Admin login");
    }
}

class RegularUser extends User
{
    @Override
    void login()
    {
        System.out.println("Regular login");
    }
}