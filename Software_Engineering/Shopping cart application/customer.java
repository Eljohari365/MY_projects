public class customer {
    private String Customername;
    private double Bankamount;
    private static int id=1000;
    
    public customer(String customer,double money,int id)
    {
        this.Customername=customer;
        this.Bankamount=money;
        id++;
    }
    
}
