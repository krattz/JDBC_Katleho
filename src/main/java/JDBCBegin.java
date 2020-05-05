import java.sql.*;

public class JDBCBegin {

    static public void dbConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Umuzi",
                "user", "pass");
        System.out.println("connected");
        Statement stmt  = conn.createStatement();
        ResultSet rs =  stmt.executeQuery("select * from customers");
        while(rs.next()){
            System.out.println(rs.getString("Customer_ID")+ " , "+rs.getNString("First_Name")+" , "+
                    rs.getString("Last_Name"));
        }
        stmt.close();
        conn.close();
    }
}
