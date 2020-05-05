import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecords {
    public static void Delete() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi", "user", "pass");
        System.out.println("connected");
        Statement stmt  = conn.createStatement();
        String record0 = "DELETE FROM Customers WHERE Customer_ID=2;";
        try {
           stmt.executeUpdate(record0);
       }catch (NullPointerException e){
           System.out.println("Cannot find record");
       }
        stmt.close();
        conn.close();
    }
}
