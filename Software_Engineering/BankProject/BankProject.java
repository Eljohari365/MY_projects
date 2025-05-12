import java.util.Scanner;

public class BankProject {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Plese enter your PIN");
        int pin=scan.nextInt();
        BankingAccount fr=new BankingAccount("Ammar","Aljohari",pin);
        boolean quit=false;
        while (!quit) {
        System.out.println("1-View balance \n2-Deposite\n3-Withdraw\n4-View my information\n5-Quit");
        int choice=scan.nextInt();
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
                System.out.println("Good bye");
                    break;
            }
        }
        }
}
