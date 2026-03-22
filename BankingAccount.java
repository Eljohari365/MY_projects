import java.util.Scanner;

public class BankingAccount{
    private static int AccId=1000;
    private String firstname ;
    private String lastname;
    private double balance=0;
    public BankingAccount()
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter Stedunt's Firstname : ");
        this.firstname=scan.nextLine();
        System.out.print("Enter Stedunt's Lastname : ");
        this.lastname=scan.nextLine();
        System.out.println("Account Genarated");
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

    public String showData()
    {
        return "The data \n"+"Name :"+firstname+" "+lastname+"\n"+"Id: "+AccId+"\n"+"Balance: "+balance;
    }
}