public class Customer extends person {
    
    private String name;
    private int id;
    private String phone;
    private String email;

    public Customer(String name,int id,String phone,String email)
    {
        this.name=name;
        this.id=id;
        this.phone=phone;
        this.email=email;
    }
    public String get_name()
    {
        return name;
    }
    public void set_name(String name)
    {
        this.name=name;
    }

    public int get_id()
    {
        return id;
    }
    public void set_id(int id)
    {
        this.id=id;
    }

    public String get_phone()
    {
        return phone;
    }
    public void set_phone(String phone)
    {
        this.phone=phone;
    }
    public String get_email()
    {
        return email;
    }
    public void set_email(String email)
    {
        this.email=email;
    }
}

