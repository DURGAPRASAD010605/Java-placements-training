package mainfiles;

import java.sql.*;

public class DBConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:sqlite:C:/Users/Ganesh/OneDrive/Desktop/sql/kuppam.db";
        return DriverManager.getConnection(url);
    }
}