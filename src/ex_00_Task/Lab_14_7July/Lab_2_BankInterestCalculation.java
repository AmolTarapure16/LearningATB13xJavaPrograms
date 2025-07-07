package ex_00_Task.Lab_14_7July;

public class Lab_2_BankInterestCalculation
{
    public static void main(String[] args)
    {
        Bank sbi = new SBI();
        sbi.getInterestRate();

        Bank hdfc = new HDFC();
        hdfc.getInterestRate();

    }
}

abstract class Bank
{
    abstract void getInterestRate();
}

class SBI extends Bank
{

    @Override
    void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}
class HDFC extends Bank
{

    @Override
    void getInterestRate()
    {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}