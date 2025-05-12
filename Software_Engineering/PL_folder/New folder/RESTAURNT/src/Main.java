import java.io.IOException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Scanner input;
    static DataHandler dataHandler;
    public static void login(String username,String password) throws IOException {
        adminInfo admin =dataHandler.getadminInfo(username);
        employeeInfo employee=dataHandler.getemployeeInfo(username);
        if(employee!=null){
            if(employee.getPassword().equals(password)){
                    EmployeeModule mod = new EmployeeModule();
                    mod.startModule();
            }
            else {
                System.out.println("incorrect password");
                return;
            }
        }
        else if(admin!=null){
            if(admin.getPassword().equals(password)){
                adminMod mod=new adminMod(admin);
                mod.startModule();
            }
            else {
                System.out.println("incorrect password");
                return;
            }
        }
        else System.out.println("user not found");
    }
    public static void main(String[] args) throws IOException {
        //log in with username and password

        String username,password;
        input=new Scanner(System.in);
        dataHandler = new DataHandler("meals.txt","offers.txt","employees.txt","admins.txt","customers.txt");
        System.out.println("welcome sir,");
        System.out.println("please enter your username");
        username=input.next();
        System.out.println("please enter your password");
        password=input.next();
        login(username,password);






        }
    }
