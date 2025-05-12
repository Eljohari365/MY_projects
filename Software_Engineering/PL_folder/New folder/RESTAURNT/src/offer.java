public class offer {
    private int id;
    private double discount;

    public offer(int id, double discount) {
        this.id = id;
        this.discount = discount;
    }
    public offer(String s){
        String[] parts = s.split("\t");
        if(parts.length>=2){
            this.id =Integer.parseInt(parts[0]);
            this.discount = Double.parseDouble(parts[1]);
        }
        else throw new IllegalArgumentException("too few parts");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    @Override
    public String toString() {
        return id+"\t"+discount;
    }

}
