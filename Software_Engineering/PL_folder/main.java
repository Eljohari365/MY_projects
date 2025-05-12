import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;
import java.util.Scanner;

public class main {
    private static Writer append;
    /**
     * @param writer TODO
     * 
     */
    public static void addCustomer(Writer writer)
    {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Let's add a new Customer :) ");
        System.out.println("Input name:  ");
        String name=scanner.nextLine();
        System.out.println("INput ID:  ");
        int id=scanner.nextInt();
        //Random rand=new Random();
        //int randId=rand.nextInt(1000);
        //int numrand=randId;
        scanner.nextLine();
        System.out.println("Enter email : ");
        String email=scanner.nextLine();
        
        System.out.println("Enter phone number: ");
        String phone=scanner.nextLine();

        Customer c=new Customer(name,id,email,phone);
        System.out.println("Done '-_-' ");
        
        // File file=new File("Customerfiles.txt");
        try{
            FileWriter write=new FileWriter("CustomersInfo.txt",true);
            write.write("Customers information :- ");
            write.write("\nID: "+id);
            write.append("\n");
            writer = write.append("Name:"+name);
            write.append("\n");
            write.append("Email: "+email);
            write.append("\n");
            write.append("Phone: "+phone);
            write.append("\n");
            write.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }
    // public static void removeCustomer()
    // {
    //     Scanner scanner=new Scanner(System.in);
    //     System.out.println("Enter Customer ID do you want to remove: ");
    //     int id=scanner.nextInt();
    //     scanner.nextLine();
    //     Customer remove= Customer.remove(id);
    //     if(remove != null)
    //     {
    //         System.out.println("Great Customer with id"+id+"has been removed");
    //     }
    //     else
    //     {
    //         System.out.println("Oops....there is no Customer with this ID, please try again later");
    //     }
    // }
    /**
     * @throws FileNotFoundException
     */
    public static void viewAllEmployees() throws FileNotFoundException
    {
        try{
        FileReader read=new FileReader("CustomersInfo.txt");
        int data = read.read();
        while (data!=-1) {
            System.out.print((char)data);
            data=read.read();
        }
        read.close();
    }
    catch(FileNotFoundException e)
    {
        e.printStackTrace();
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }
    

    }
    /**
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException
    {
        
        Scanner scanner=new Scanner(System.in);
        boolean quit=false;

        while (!quit) {
            System.out.println("Welcome to our System");
            System.out.println("Select one option from the following ");
            System.out.println("1-Add Customer");
            System.out.println("2-remove a customer ");
            System.out.println("3-view customers list ");
            System.out.println("4-Update cusomer information");
            System.out.println("5-Search about customer by name ");
            System.out.println("6-quit");
            int option=scanner.nextInt();
            scanner.nextLine();          
            switch (option) {
                case 1:
                addCustomer(append);
                break;
                case 2:
                // removeCustomer();
                break;
                case 3:
                viewAllEmployees();
                break;
                case 6:
                System.out.println("Done");
                quit=true;
                break;
                default:
                System.out.println("invalid option , Please try again later");
                    break;

            }
        }
        
    }        
}


