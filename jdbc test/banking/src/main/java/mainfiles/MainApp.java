package mainfiles;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws Exception {

        BankDAO dao = new BankDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Create 2.Deposit 3.Withdraw 4.View");
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.print("ID: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Address: ");
                String addr = sc.nextLine();

                System.out.print("City: ");
                String city = sc.nextLine();

                System.out.print("Pincode: ");
                int pin = sc.nextInt();
                sc.nextLine();

                System.out.print("Phone: ");
                String phone = sc.nextLine();

                System.out.print("Initial Deposit: ");
                double bal = sc.nextDouble();

                dao.createCustomer(new Customer(id, name, addr, city, pin, phone, bal));
                break;

            case 2:
                System.out.print("Customer ID: ");
                int did = sc.nextInt();

                System.out.print("Amount: ");
                double amt = sc.nextDouble();

                dao.deposit(did, amt);
                break;

            case 3:
                System.out.print("Customer ID: ");
                int wid = sc.nextInt();

                System.out.print("Amount: ");
                double wamt = sc.nextDouble();

                dao.withdraw(wid, wamt);
                break;

            case 4:
                dao.display();
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}