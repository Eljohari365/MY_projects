import java.util.Scanner;

public class Email {
    private String firstname;
    private String lastname;
    private String password;
    private int Defultpasswordlength=12;
    private String department;
    private int mailboxcapacity=100;
    private String email;
    private String CompanySuffix="Muskcode.com";
    private String alternateEmail;

    public Email(String Firstname,String Lastname){
        this.firstname=Firstname; 
        this.lastname=Lastname;
        System.out.println("New Employee Called "+Firstname+". Could you please Enter the department code :-)");

        this.department=Depset();
        //System.out.println(this.firstname+" "+this.lastname+" Working on "+this.department+" department.");

        this.password=PasswordSet(Defultpasswordlength);
        System.out.println(this.firstname+" "+this.lastname+" Password : "+this.password);

        this.email=this.firstname+this.lastname+"@"+this.department+"."+this.CompanySuffix;
     //   System.out.println(this.firstname+" "+this.lastname+" Email : "+this.email); 
    }


    private String Depset()
    {
        System.out.println("1:Accounting \n2:Devlopment \n3:Sales");
        Scanner scan=new Scanner(System.in);
        int depchoice=scan.nextInt();
        if(depchoice==1){return "Accounting";}
        else if(depchoice==2){return "Devlopment";}
        else if(depchoice==3){return "Sales";}
        else {
            return "";
        }
    }

    private String PasswordSet(int length)
    {
        String passwordset="azsxdcfvgbhnmjklpoiuytrewq@#$%^&*97854126";
        char[] password=new char[length];
        for(int i=0;i<length;i++)
        {
            int rand =(int)(Math.random()*passwordset.length());
            password[i]=passwordset.charAt(rand);
        }
        return new String(password);
    }

    public void SetemailCapacity(int Cap)
    {
        this.mailboxcapacity=Cap;
    }

    public void setternateEmail(String Email)
    {
        this.alternateEmail=Email;
    }

    public void ChangePass(String Newpass)
    {
        this.password=Newpass;
    }

    public String getpass(){ return password;}
    public int getemailCapacity(){ return mailboxcapacity;}
    public String getalternateEmail(){return alternateEmail;}

    public String ShowData()
    {
        return "Display name: "+firstname+" "+lastname+"\nCompany Email: "+email+"\nMailbox Capacity: "+mailboxcapacity+"Mb";

    }
}
