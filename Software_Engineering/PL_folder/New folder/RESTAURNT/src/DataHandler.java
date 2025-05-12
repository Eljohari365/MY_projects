import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileWriter;


public class DataHandler {
    String MealsFilePath;
    String OffersFilePath;
    String EmployeesFilePath;
    String AdminsFilePath;
    String CustomersFilePath;
    File MealsFile;
    File OffersFile;
    File EmployeesFile;
    File AdminsFile;
    File CustomersFile;
    FileWriter MealsFileWriter;
    FileWriter OffersFileWriter;
    FileWriter EmployeesFileWriter;
    FileWriter AdminsFileWriter;
    FileWriter CustomersFileWriter;
    Scanner MealsFileReader;
    Scanner OffersFileReader;
    Scanner EmployeesFileReader;
    Scanner AdminsFileReader;
    Scanner CustomersFileReader;
    ArrayList<meal> MealsList;
    ArrayList<offer> OffersList;
    ArrayList<employeeInfo> EmployeesList;
    ArrayList<adminInfo> AdminsList;
    ArrayList<Customer> CustomersList;

    public DataHandler(String mealsFilePath, String offersFilePath, String employeesFilePath, String adminsFilePath, String customersFilePath) throws IOException {
        MealsFilePath = mealsFilePath;
        OffersFilePath = offersFilePath;
        EmployeesFilePath = employeesFilePath;
        AdminsFilePath = adminsFilePath;
        CustomersFilePath = customersFilePath;
        MealsFile = new File(MealsFilePath);
        OffersFile = new File(OffersFilePath);
        EmployeesFile = new File(EmployeesFilePath);
        AdminsFile = new File(AdminsFilePath);
        CustomersFile = new File(CustomersFilePath);
        MealsFile.createNewFile();
        OffersFile.createNewFile();
        EmployeesFile.createNewFile();
        AdminsFile.createNewFile();
        CustomersFile.createNewFile();
        MealsFileReader = new Scanner(MealsFile);
        OffersFileReader = new Scanner(OffersFile);
        EmployeesFileReader = new Scanner(EmployeesFile);
        AdminsFileReader = new Scanner(AdminsFile);
        CustomersFileReader = new Scanner(CustomersFile);
        MealsList = new ArrayList<>();
        OffersList = new ArrayList<>();
        EmployeesList = new ArrayList<>();
        AdminsList = new ArrayList<>();
        CustomersList = new ArrayList<>();
        MealsFileReader.reset();
        OffersFileReader.reset();
        EmployeesFileReader.reset();
        AdminsFileReader.reset();
        CustomersFileReader.reset();
        while (MealsFileReader.hasNextLine()) {
            String line = MealsFileReader.nextLine();
            MealsList.add(new meal(line));
        }
        while (EmployeesFileReader.hasNextLine()) {
            String line = EmployeesFileReader.nextLine();
            EmployeesList.add(new employeeInfo(line));
        }
        while (OffersFileReader.hasNextLine()) {
            String line = OffersFileReader.nextLine();
            OffersList.add(new offer(line));
        }
        while (AdminsFileReader.hasNextLine()) {
            String line = AdminsFileReader.nextLine();
            AdminsList.add(new adminInfo(line));
        }
        while (CustomersFileReader.hasNextLine()) {
            String line = CustomersFileReader.nextLine();
            CustomersList.add(new Customer(line));
        }
        MealsFileReader.close();
        OffersFileReader.close();
        EmployeesFileReader.close();
        AdminsFileReader.close();
        CustomersFileReader.close();
    }
    public void save() throws IOException {

        MealsFileWriter = new FileWriter(MealsFile, false);
        OffersFileWriter = new FileWriter(OffersFile, false);
        EmployeesFileWriter = new FileWriter(EmployeesFile, false);
        AdminsFileWriter = new FileWriter(AdminsFile, false);
        CustomersFileWriter = new FileWriter(CustomersFile, false);
        String Mealstring = "";
        for (meal prdct : MealsList) {
            Mealstring += prdct.toString()+"\n";
        }
        MealsFileWriter.write(Mealstring);
        String Offerstring = "";
        for (offer off : OffersList) {
            Offerstring += off.toString()+"\n";;
        }
        OffersFileWriter.write(Offerstring);
        String Employeestring = "";
        for (employeeInfo cli : EmployeesList) {
            Employeestring += cli.toString()+"\n";;
        }
        EmployeesFileWriter.write(Employeestring);
        String AdminString = "";
        for (adminInfo prdct : AdminsList) {
            AdminString += prdct.toString()+"\n";;
        }
        AdminsFileWriter.write(AdminString);
        String Customerstring = "";
        for (Customer prdct : CustomersList) {
            Customerstring += prdct.toString()+"\n";
        }
        CustomersFileWriter.write(Customerstring);
        MealsFileWriter.close();
        OffersFileWriter.close();
        EmployeesFileWriter.close();
        AdminsFileWriter.close();
        CustomersFileWriter.close();
    }
    // meal
    public meal getmeal(int id) {
        for (meal meal : MealsList) {
            if (meal.getId() == id) {
                return meal;
            }
        }
        return null;
    }

    public meal[] getAllMeals() {
        return Arrays.copyOf(MealsList.toArray(),MealsList.size(),meal[].class);
    }

    public void addmeal(meal meal) throws IOException {
        MealsList.add(meal);
        save();
    }
    public void removemeal(int id) throws IOException {
        for (int i = 0; i < MealsList.size(); i++) {
            if (MealsList.get(i).getId() == id) {
                MealsList.remove(i);
                break;
            }
        }
        save();
    }
    public void updatemeal(int id, meal meal) throws IOException {
        for (int i = 0; i < MealsList.size(); i++) {
            if (MealsList.get(i).getId() == id) {
                MealsList.set(i, meal);
                break;
            }
        }
        save();
    }

    // offer
    public offer getoffer(int id) {
        for (offer offer : OffersList) {
            if (offer.getId() == id) {
                return offer;
            }
        }
        return null;
    }

    public offer[] getAllOffers() {
        return Arrays.copyOf(OffersList.toArray(),OffersList.size(),offer[].class);
    }
    public void addoffer(offer offer) throws IOException {
        OffersList.add(offer);
        save();
    }
    public void removeoffer(int id) throws IOException {
        for (int i = 0; i < OffersList.size(); i++) {
            if (OffersList.get(i).getId() == id) {
                OffersList.remove(i);
                break;
            }
        }
        save();
    }
    // employeeInfo
    public employeeInfo getemployeeInfo(String username) {
        for (employeeInfo employeeInfo : EmployeesList) {
            if (employeeInfo.getUserName().equals(username)) {
                return employeeInfo;
            }
        }
        return null;
    }
    public void addemployeeInfo(employeeInfo employeeInfo) throws IOException {
        EmployeesList.add(employeeInfo);
        save();
    }
    public void removeemployeeInfo(String username) throws IOException {
        for (int i = 0; i < EmployeesList.size(); i++) {
            if (EmployeesList.get(i).getUserName().equals(username)) {
                EmployeesList.remove(i);
                break;
            }
        }
        save();
    }
    public void updateemployeeInfo(String username, employeeInfo employeeInfo) throws IOException {
        for (int i = 0; i < EmployeesList.size(); i++) {
            if (EmployeesList.get(i).getUserName().equals(username)) {
                EmployeesList.set(i, employeeInfo);
                break;
            }
        }
        save();
    }
    // adminInfo
    public adminInfo getadminInfo(String username) {
        for (adminInfo adminInfo : AdminsList) {
            if (adminInfo.getUserName().equals(username)) {
                return adminInfo;
            }
        }
        return null;
    }
    // Customer
    public Customer getCustomer(int id) {
        for (Customer customer : CustomersList) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    public Customer[] getAllCustomers() {
        return Arrays.copyOf(CustomersList.toArray(),CustomersList.size(),Customer[].class);
    }

    public void addCustomer(Customer customer) throws IOException {
        CustomersList.add(customer);
        save();
    }
    public void removeCustomer(int id) throws IOException {
        for (int i = 0; i < CustomersList.size(); i++) {
            if (CustomersList.get(i).getId() == id) {
                CustomersList.remove(i);
                break;
            }
        }
        save();
    }
    public void updateCustomer(int id, Customer customer) throws IOException {
        for (int i = 0; i < CustomersList.size(); i++) {
            if (CustomersList.get(i).getId() == id) {
                CustomersList.set(i, customer);
                break;
            }
        }
        save();
    }
}
