import java.util.Scanner;

public class BankingAccount{
    private static int AccId=1000;
    private String firstname;
    private String lastname;
    private int pin;
    private double balance=0;
    public BankingAccount(String firstname,String lastname,int pin)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.pin=pin;
        GenerateID();
    }
    public void GenerateID()
    {
        AccId++;
    }
    public double viewbalance()
    {
        return balance;
    }
    public double deposite(double value)
    {
        if(value!=0)
        {
            balance=balance+value;
        }
        return value;
    }

    public double Withdraw(double value)
    {
        if(balance<value)
        {
            System.out.println("Sorry this is not allowed");
        }
        else
        {
            balance=balance-value;
        }
        return value;
    }

    public void showData()
    {
        System.out.println("Name :"+firstname+" "+lastname+"\n"+"Id: "+AccId+"\n"+"Balance: "+balance);
    }
}