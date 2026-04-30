package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:C:/Users/Ganesh/OneDrive/Desktop/sql/kuppam.db";
        return DriverManager.getConnection(url);
    }
}