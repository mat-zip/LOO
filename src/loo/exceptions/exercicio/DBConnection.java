package loo.exceptions.exercicio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";
    private static final String CONN = "jdbc:mysql://localhost/school";

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(USERNAME, PASSWORD, CONN);
    }
}
