import java.util.ArrayList;

public class order extends meal {
    private ArrayList <String> order=new ArrayList<String>();
    int order_id;

    public order(){
        this.order=new ArrayList<>();
    }

    public void add_items(String meal)
    {
        order.add(meal);
    }

    public order(String Meal,int meal_id,int price,int order_id){
        name=Meal;
        id=meal_id;
        price=price;
        order_id=order_id;
    }
    public void set_orderid(int id)
    {
        this.order_id=id;
    }
    public int set_orderid()
    {
        return order_id;
    }
}
