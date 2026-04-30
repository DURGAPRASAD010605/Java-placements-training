package mainfiles;
import java.sql.*;

public class BankDAO {

    // CREATE CUSTOMER
    public void createCustomer(Customer c) throws Exception {
        String sql = "INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, c.getCustomerId());
            ps.setString(2, c.getName());
            ps.setString(3, c.getAddress());
            ps.setString(4, c.getCity());
            ps.setInt(5, c.getPincode());
            ps.setString(6, c.getPhoneNo());
            ps.setDouble(7, c.getInitialDeposit());

            ps.executeUpdate();
            System.out.println("Customer created!");
        }
    }

    // VIEW ALL
    public void display() throws Exception {
        String sql = "SELECT * FROM customer";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                    rs.getInt("customer_id") + " " +
                    rs.getString("name") + " " +
                    rs.getString("city") + " " +
                    rs.getDouble("initial_deposit")
                );
            }
        }
    }

    // DEPOSIT
    public void deposit(int id, double amount) throws Exception {
        String sql = "UPDATE customer SET initial_deposit = initial_deposit + ? WHERE customer_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, amount);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Amount deposited!");
        }
    }

    // WITHDRAW
    public void withdraw(int id, double amount) throws Exception {
        String check = "SELECT initial_deposit FROM customer WHERE customer_id=?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(check)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                double bal = rs.getDouble(1);

                if (bal >= amount) {
                    String sql = "UPDATE customer SET initial_deposit = initial_deposit - ? WHERE customer_id=?";

                    PreparedStatement ps2 = con.prepareStatement(sql);
                    ps2.setDouble(1, amount);
                    ps2.setInt(2, id);
                    ps2.executeUpdate();

                    System.out.println("Withdrawal successful!");
                } else {
                    System.out.println("Insufficient balance!");
                }
            }
        }
    }
}