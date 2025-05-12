import java.io.*;
import java.util.*;

public class EmployeeModule {
    /**h
     * 
     */
    public void addCustomer() throws IOException {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Let's add a new Customer : ");
        System.out.println("Input name:  ");
        String name=scanner.nextLine();
        Random rand=new Random();
        int randId=rand.nextInt(1000);

        Customer c=new Customer(name,randId,new ArrayList<>(),new ArrayList<>(), null);
        Main.dataHandler.addCustomer(c);
        System.out.println("Done '-_-' ");
    
        
        
        // File file=new File("Customerfiles.txt");
        
    }
    
    
    public void removeCustomer() throws IOException {
        System.out.println("Choose customer To remove:");
        for (Customer cust : Main.dataHandler.getAllCustomers()) {
        System.out.println(cust.getId() + ": " + cust.getName());
        }
        System.out.print("id: ");
        int id = Main.input.nextInt();
        if (Main.dataHandler.getCustomer(id) != null)
        {
                Main.dataHandler.removeCustomer(id);
                System.out.println("Customer removed. ");

        } 





    }
        ///  ArrayList<String> customerinfo = new ArrayList<>();
        // Scanner scanner=new Scanner(System.in);
        // System.out.println("Enter Customer ID do you want to remove: ");
        // int id=scanner.nextInt();
         //scanner.nextLine();
//         customerinfo.remove(id);
//         int item =0;
//         for (int i=0; i< customerinfo.length ; );
//         customerinfo.remove(String .valueOf(id)); 

         
    //     if(remove != null)
    //     {
    //         System.out.println("Great Customer with id"+id+"has been removed");
    //     }
    //     else
    //     {
    //         System.out.println("Oops....there is no Customer with this ID, please try again later");
    //     }

    /**
     * @throws FileNotFoundException
     */
    public void viewAllCustomer() throws FileNotFoundException
    {
        for(Customer cust : Main.dataHandler.getAllCustomers()){
            System.out.println(cust.getId()+": "+cust.getName());
        }
    }
    private void upateCustomerinfo() throws IOException
    {
    System.out.println("Choose customer");
    for(Customer cust : Main.dataHandler.getAllCustomers()){
        System.out.println(cust.getId()+": "+cust.getName());
    }
        System.out.print("Id: ");
    int id=Main.input.nextInt();
    if(Main.dataHandler.getCustomer(id)!=null){
    System.out.println("Enter customer new name:");
    String newName=Main.input.next();
        Customer customer =  Main.dataHandler.getCustomer(id);
        customer.setName(newName);
        Main.dataHandler.updateCustomer(id,customer);
        System.out.println("Customer name updated. ");
    }
    else {
    System.out.println("Unknown id.");
    }
    }
    private void searchbyname()
    {
        System.out.println("Enter customer name:");
        String phrase=Main.input.next();
        for(Customer cust : Main.dataHandler.getAllCustomers()){
            if(cust.getName().contains(phrase))
                System.out.println(cust.getId()+": "+cust.getName());
        }

    }

    /**
     * @param
     * @throws FileNotFoundException
     */
    public void startModule() throws FileNotFoundException, IOException
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
            System.out.println("6-Make order");
            System.out.println("6-quit");
            int option=scanner.nextInt();
            scanner.nextLine();          
            switch (option) {
                case 1:
                addCustomer();
                break;
                case 2:
                removeCustomer();
                break;
                case 3:
                viewAllCustomer();
                break;
                case 4:
                upateCustomerinfo();
                break;
                case 5:
                searchbyname();
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