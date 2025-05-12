
import java.util.ArrayList;

public class Customer {
    
    private String name;
    private int id;
    private ArrayList<String> Payments;
    private ArrayList<offer> Offers;

    private ArrayList<order> order;

    public Customer(String name, int id, ArrayList<String> payments, ArrayList<offer> offers,ArrayList<order> order) {
        this.name = name;
        this.id = id;
        Payments = payments;
        Offers = offers;
        order=order;
    }
    public Customer(String s){
        String[] parts = s.split("\t");
        if(parts.length>=2){
            this.id = Integer.parseInt(parts[0]);
            this.name = parts[1];
            Payments=new ArrayList<>();
            Offers=new ArrayList<>();
            int i = 2;
            for(;i<parts.length;i++){
                if(parts[i]!="\u0007O"){
                    Payments.add(parts[i]);
                }
                else {
                    break;
                }
            }
            i++;
            for(;i<parts.length;i++){
                Offers.add(Main.dataHandler.getoffer(Integer.parseInt(parts[i])));
            }
        }
        else throw new IllegalArgumentException("too few parts");
    }
    

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }

    public int getId()
    {
        return id;
    }
    public void setId(int id)
    {
        this.id=id;
    }

    public ArrayList<String> getPayments() {
        return Payments;
    }

    public void setPayments(ArrayList<String> payments) {
        Payments = payments;
    }

    public ArrayList<order> get_order() {
        return order;
    }

    public void setOrder(ArrayList<String> order) {
        order = order;
    }

    public ArrayList<offer> getOffers() {
        return Offers;
    }

    public void setOffers(ArrayList<offer> offers) {
        Offers = offers;
    }

    @Override
    public String toString() {
        String s = id+"\t"+name;
        for (String payment : Payments){
            s+="\t"+payment;
        }
        s+="\t\u0007O";
        for (offer Offer : Offers){
            s+="\t"+Offer.getId();
        }
        return s;
    }
}