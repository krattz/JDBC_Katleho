import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateInserts {
    public static void Updateinserts () throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi", "user", "pass");
        System.out.println("connected");
        Statement stmt  = conn.createStatement();
        String update0 = "SELECT * FROM Customers;";
        String update1 = "SELECT First_Name FROM Customers;";
        String update2 = "SELECT First_Name FROM Customers WHERE Customer_ID=1;";
        String update3 = "UPDATE Customers SET First_Name='Lerato', Last_Name'Mabitso' WHERE Customer_ID=1;";
        String select0 = "SELECT COUNT(Status) FROM Orders;";
        String select1 = "SELECT MAX(Amount) FROM Payments;";
        try {
            stmt.executeQuery(update0);
            stmt.executeQuery(update1);
            stmt.executeQuery(update2);
            stmt.executeUpdate(update3);
            stmt.executeQuery(select0);
            stmt.executeQuery(select1);
        }catch (SQLException e){
            System.out.println("Cannot execute");
        }
        stmt.close();
        conn.close();
    }
}
