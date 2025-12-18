package org.example.autonobarberdesktop.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/autonobarber?useTimezone=true&serverTimezone=UTC", "user", "pass123");
    }
}
