package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Employee {
    public static void main(String[] args) {
        Main m = new Main();
        m.setName("Rdp");
        m.setId(123);
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session ob = sf.openSession();
        Transaction tx = ob.beginTransaction();
        ob.persist(m);
        tx.commit();

    }
}
