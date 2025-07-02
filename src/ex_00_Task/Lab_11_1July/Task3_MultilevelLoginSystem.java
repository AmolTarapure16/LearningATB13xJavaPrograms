package ex_00_Task.Lab_11_1July;

public class Task3_MultilevelLoginSystem
{
    public static void main(String[] args)
    {
        SuperAdmin sa = new SuperAdmin();
        sa.login();
        sa.accessAdminPanel();
        sa.shutdownSystem();
    }
}


class User
{
    void login()
    {
        System.out.println("1- User Login");
    }
}

class AdminUser extends User
{
    void accessAdminPanel()
    {
        System.out.println("2- Access Admin Panel");
    }
}

class SuperAdmin extends AdminUser
{
    void shutdownSystem()
    {
        System.out.println("3- Shut Down System");
    }
}