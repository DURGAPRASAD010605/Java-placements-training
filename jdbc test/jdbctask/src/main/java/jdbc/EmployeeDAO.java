package jdbc;

import java.sql.*;

public class EmployeeDAO {

    // INSERT
    public void insert(Employee e) throws SQLException {
        String sql = "INSERT INTO emp_master(empno, empname, address, city) VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, e.getEmpno());
            ps.setString(2, e.getEmpname());
            ps.setString(3, e.getAddress());
            ps.setString(4, e.getCity());

            ps.executeUpdate();
            System.out.println("Inserted successfully");
        }
    }

    // DISPLAY
    public void display() throws SQLException {
        String sql = "SELECT * FROM emp_master";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            System.out.println("\n--- DATA ---");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("empno") + " " +
                        rs.getString("empname") + " " +
                        rs.getString("address") + " " +
                        rs.getString("city")
                );
            }
        }
    }

    // UPDATE
    public void update(int empno, String address) throws SQLException {
        String sql = "UPDATE emp_master SET address=? WHERE empno=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, address);
            ps.setInt(2, empno);

            int rows = ps.executeUpdate();
            System.out.println("Updated rows: " + rows);
        }
    }

    // DELETE
    public void delete(int empno) throws SQLException {
        String sql = "DELETE FROM emp_master WHERE empno=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, empno);
            int rows = ps.executeUpdate();

            System.out.println("Deleted rows: " + rows);
        }
    }
}