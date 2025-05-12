import java.util.ArrayList;

/**
 * ShoppingCart
 */
public class ShoppingCart {

    private String Itemname;
    private double price;
    private int code;
    private int quantity;

    public ShoppingCart(String Itemname,double price,int quantity,int code)
    {
        this.Itemname=Itemname;
        this.price=price;
        this.quantity=quantity;
        this.code=code;
    }
    public void setPrice(double num)
    {
        this.price=num;
    }
    public String GetItemname()
    {
        return this.Itemname;
    }

    public double Getprice()
    {
        return this.price;
    }
    public int getquantity()
    {
        return this.quantity;
    }

    public int getCode(){
        return code;
    }
}