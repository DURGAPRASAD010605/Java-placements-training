package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Cndselect {
    public static void main(String[] args) {
        String url = "jdbc:sqlite:C:/Users/Ganesh/OneDrive/Desktop/sql/kuppam.db";
        String sql = "SELECT * from emp_master where empno=?";
        try {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Empno:");
            int Empno=sc.nextInt();
            Connection con = DriverManager.getConnection(url);
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, Empno);
            ResultSet rs = pstmt.executeQuery();
            if(!rs.next()){
                System.out.println("No employee found with Empno: " + Empno);
            } else {
                System.out.println(
                    rs.getInt(1) + " " +
                    //rs.getInt(2) + " " +
                    rs.getString(2)+" " +
                    rs.getString(3)+" "+
                    rs.getString(4)
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

