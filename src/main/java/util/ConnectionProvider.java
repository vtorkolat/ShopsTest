package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {
    private Connection connection;

    private static final String USER = "test";
    private static final String PASSWORD = "test";
    private static final String URL = "jdbc:mysql://localhost:5432/shopstest";

    public void init() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Can't connect to the DB");
            e.printStackTrace();
        }
    }

     public void close() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Can't close connection to the DB");
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

}
