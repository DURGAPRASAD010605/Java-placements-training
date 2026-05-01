package main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address (Department): ");
        String dept = sc.nextLine();

        // Hibernate setup
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        // Set values
        Employee emp = new Employee();
        emp.setId(id);
        emp.setName(name);
        emp.setDepartment(dept);

        // Save
        session.save(emp);

        tx.commit();
        session.close();
        factory.close();
        sc.close();

        System.out.println("Inserted successfully!");
    }
}