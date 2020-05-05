import java.sql.SQLException;

public class MainProgram {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JDBCBegin.dbConnection();
        UpdateInserts.Updateinserts();
        DeleteRecords.Delete();

    }
}
