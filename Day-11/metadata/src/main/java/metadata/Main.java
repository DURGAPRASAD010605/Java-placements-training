package metadata;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address (Department): ");
        String dept = sc.nextLine();

        StandardServiceRegistry registry =
                new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml")
                .build();

        MetadataSources sources = new MetadataSources(registry);

        // ✅ register entity
        sources.addAnnotatedClass(Employee.class);

        Metadata metadata = sources.buildMetadata();

        SessionFactory factory = metadata.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Employee emp = new Employee();
        emp.setId(id);
        emp.setName(name);
        emp.setDepartment(dept);

        session.save(emp);

        tx.commit();
        session.close();
        factory.close();
        sc.close();

        System.out.println("Inserted successfully!");
    }
}