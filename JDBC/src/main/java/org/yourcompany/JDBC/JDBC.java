package org.yourcompany.JDBC;

import java.sql.*;
import java.util.Scanner;

public class JDBC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // ✅ Correct database path
            String url = "jdbc:sqlite:C:/Users/Ganesh/OneDrive/Desktop/sql/kuppam.db";

            Connection con = DriverManager.getConnection(url);
            System.out.println("Connected to DB!");

            Statement stmt = con.createStatement();

            // ✅ Clean table (no spaces, no spelling issues)
            stmt.execute(
                "CREATE TABLE IF NOT EXISTS Student_master (" +
                "admission_number INTEGER, " +
                "name TEXT, " +
                "address TEXT)"
            );

            // ✅ Take input
            System.out.print("Enter Admission Number: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            // ✅ Insert data
            String insertSQL = "INSERT INTO Student_master(admission_number, name, address) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(insertSQL);

            ps.setInt(1, id);
            ps.setString(2, name);
            ps.setString(3, address);

            ps.executeUpdate();
            System.out.println("Data inserted!");

            // ✅ Display data
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student_master");

            System.out.println("\n--- Student Data ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("admission_number") + " " +
                        rs.getString("name") + " " +
                        rs.getString("address")
                );
            }

            con.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}