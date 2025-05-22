package udla.vmathias.java.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    //String url = "jdbc:mysql://localhost:3306/java_db?serverTimezone=America/Guayaquil";
    public static String url = "jdbc:mysql://localhost:3306/java_db?serverTimezone=UTC";
    public static String username = "root";
    public static String password = "sasa";
    private static Connection connection;

    public static Connection getInstance() throws SQLException{
        if (connection == null){
            connection = DriverManager.getConnection(url, username, password);
        }

        return connection;
    }

}
