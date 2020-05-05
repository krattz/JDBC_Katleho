import java.sql.*;

public class JDBCBegin {

    static public void dbConnection() throws SQLException {
        try {
            Class.forName("org.posgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = DriverManager.getConnection("jdbc:postgres://localhost:5432/Umuzi", "postgres", "pass");
        System.out.println("connected");
        Statement stmt  = conn.createStatement();
        ResultSet rs =  stmt.executeQuery("select * from customers");
        while(rs.next()){
            System.out.println(rs.getString("customerID")+ " , "+rs.getNString("firstName")+" , "+
                    rs.getString("lastName"));

        }
    }
}
