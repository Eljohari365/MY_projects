import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class CartManager {
    private String mangername="Hossam Hassan";
    private int id =1234;

    private ArrayList<ShoppingCart> shoppingCartList = new ArrayList<>();
    public CartManager(){
    ShoppingCart item1=new ShoppingCart("Porche GT3",205000.0,1,123);
    ShoppingCart item2=new ShoppingCart("Nissan Gtr",150000.680,6,54);
    ShoppingCart item3=new ShoppingCart("Nissan patrol nismo",35000.500,5,33);
    
    shoppingCartList.add(item1);
    shoppingCartList.add(item2);
    shoppingCartList.add(item3);
    }

    
    public boolean is_available(int code)
    {
        for(ShoppingCart item :shoppingCartList)
        {
            if(item.getCode()==code)
            {
                return true;
            }
            
        }
        return false;
    }

    public void removeItem(int code) {
        Iterator<ShoppingCart> iterator = shoppingCartList.iterator();
        while (iterator.hasNext()) {
            ShoppingCart item = iterator.next();
            if (item.getCode() == code) {
                iterator.remove();}
        }
    }
    
    public void ShowItems()
    {
        for (ShoppingCart cartItem : shoppingCartList) {
            System.out.println("Item: " + cartItem.GetItemname() +
            ", Price: " + cartItem.Getprice() +", Quantity: " + cartItem.getquantity());
        }
    }
}
