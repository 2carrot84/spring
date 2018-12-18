package mysql;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnectionTest {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/testdb?userSSL=false";
    private static final String USER = "dev";
    private static final String PW = "1234qwer";

    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);

        try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(con);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
