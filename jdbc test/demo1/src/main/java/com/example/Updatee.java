package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Updatee{
         public static void main(String[] args) {
        String url = "jdbc:sqlite:C:\\Users\\Ganesh\\OneDrive\\Desktop\\sql\\kuppam.dbppam.db";
        try {
            Connection con = DriverManager.getConnection(url);
            Statement stmt = (Statement) con.createStatement();
            String query="UPDATE Emp_master set Address=? where Empno=?";
            PreparedStatement pstmt=con.prepareStatement(query);
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Empno:");
            int Empno=sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Address:");
            String Address=sc.nextLine();
            pstmt.setString(1, Address);
            pstmt.setInt(2, Empno);
            pstmt.executeUpdate();
            int rows = pstmt.executeUpdate();
System.out.println("Rows updated: " + rows);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
