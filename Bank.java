import java.util.Scanner;

public class Bank {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Hi in our bank system");
        System.out.println("Enter your basic Information to continue.......");
        BankingAccount fr=new BankingAccount();
        System.out.println("Okkay ");
        System.out.println("1-View balance \n2-Deposite\n3-Withdraw\n4-View my information\n5-Quit");
        Scanner scan=new Scanner(System.in);
        int choice=scan.nextInt();
        boolean quit=false;
        while (!quit) {
            switch (choice) {
                case 1:
                    System.out.println(fr.viewbalance());
                    break;
                case 2:
                System.out.println("Enter the value of deposite: ");
                double balace=scan.nextDouble();
                    fr.deposite(balace);
                    break;
                case 3:
                System.out.println("Enter the value of Withdraw: ");
                double value=scan.nextDouble();
                    fr.deposite(value);
                    break;
                case 4:
                fr.showData();
                break;
                case 5:
                quit=true;
                System.out.println("Thanks");
                default:
                System.out.println("Try again");
                    break;
            }
        
        }
            }
}
