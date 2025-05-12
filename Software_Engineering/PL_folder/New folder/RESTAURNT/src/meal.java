public class meal {
    protected String name;
    protected int id;
    protected int price;

    meal(){
        name="";
        id=0;
        price=0;
    }
    public meal(String name, int id, int price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    public meal(String s){
        String[] parts = s.split("\t");
        if(parts.length>=3){
            this.name = parts[0];
            this.id =Integer.parseInt(parts[1]);
            this.price = Integer.parseInt(parts[2]);
        }
        else throw new IllegalArgumentException("too few parts");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return name+"\t"+id+"\t"+price;
    }
}
