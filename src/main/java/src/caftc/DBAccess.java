package src.caftc;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBAccess {
    public Connection databaseConnection;
    public Connection getConnection() {
        String dbName = "odhisika";
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/" + dbName;
        String user = "root";
        String password = "";


        try {
            Class.forName(driver);
            databaseConnection = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return databaseConnection;


    }

}
