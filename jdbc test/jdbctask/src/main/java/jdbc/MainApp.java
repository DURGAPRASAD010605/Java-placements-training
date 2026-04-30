package jdbc;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws Exception {

        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Insert  2.Update  3.Delete  4.Display");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Empno: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Address: ");
                String addr = sc.nextLine();

                System.out.print("City: ");
                String city = sc.nextLine();

                dao.insert(new Employee(id, name, addr, city));
                break;

            case 2:
                System.out.print("Empno: ");
                int uid = sc.nextInt();
                sc.nextLine();

                System.out.print("New Address: ");
                String newAddr = sc.nextLine();

                dao.update(uid, newAddr);
                break;

            case 3:
                System.out.print("Empno: ");
                int did = sc.nextInt();

                dao.delete(did);
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