package org.yourcompany.JDBCConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String url = "jdbc:sqlite:C:/Users/Ganesh/OneDrive/Desktop/sql/kuppam.db";
            Connection con = DriverManager.getConnection(url);
            System.out.println("Connected to DB!");
            Statement stmt = con.createStatement();
            stmt.execute(
                "CREATE TABLE IF NOT EXISTS Student_master (" +
                "admission_number INTEGER, " +
                "name TEXT, " +
                "address TEXT)"
            );
            System.out.print("Enter Admission Number: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Address: ");
            String address = sc.nextLine();
            String insertSQL = "INSERT INTO Student_master1(admission_number, name, address) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSQL);
            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.executeUpdate();
            System.out.println("Data inserted!");
            con.close();
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}