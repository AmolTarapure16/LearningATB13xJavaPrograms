package ex_20_OOPs_Polymorphism.PM_02_methodoveridding;

public class Lab190_Methodoverrding_Automation
{
    public static void main(String[] args)
    {
      Chrome c1 = new Chrome();
      c1.openBrowser();

      Firefox f1= new Firefox();
      f1.openBrowser();

      CommonToAll ca = new CommonToAll();
      ca.openBrowser();


    }
}


class CommonToAll
{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }

}
class Chrome extends CommonToAll
{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!!");
    }
}

class Firefox extends CommonToAll
{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }

}