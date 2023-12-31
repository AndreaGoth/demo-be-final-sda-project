package com.example.finalsdaproject.dbexpender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExpenderCustomer {
    // Define constants for database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sda-ecommerce";
    private static final String DB_USER = "Andre";
    private static final String DB_PASSWORD = "Eumajocpecomp1.";

    // Define constant for SQL statement
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS customer ("
            + "customer_id INT AUTO_INCREMENT PRIMARY KEY, "
            + "first_name VARCHAR(50) NOT NULL, "
            + "last_name VARCHAR(50) NOT NULL, "
            + "email VARCHAR(100) NOT NULL UNIQUE, "
            + "phone VARCHAR(20), "
            + "address VARCHAR(255)"
            + ")";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Create a Statement object for executing SQL commands
            Statement statement = connection.createStatement();

            // Execute the SQL command to create the customer table
            statement.executeUpdate(CREATE_TABLE_SQL);

            System.out.println("Customer table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

//package com.example.finalsdaproject.dbexpender;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DBExpenderCustomer {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/sda-ecommerce";
//        String user = "Andre";
//        String password = "Eumajocpecomp1.";
//
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            // Create a Statement object for executing SQL commands
//            Statement statement = connection.createStatement();
//
//            // SQL command to create the customer table
//            String createTableSQL = "CREATE TABLE IF NOT EXISTS customer ("
//                    + "customer_id INT AUTO_INCREMENT PRIMARY KEY, "
//                    + "first_name VARCHAR(50) NOT NULL, "
//                    + "last_name VARCHAR(50) NOT NULL, "
//                    + "email VARCHAR(100) NOT NULL UNIQUE, "
//                    + "phone VARCHAR(20), "
//                    + "address VARCHAR(255)"
//                    + ")";
//
//            // Execute the SQL command to create the customer table
//            statement.executeUpdate(createTableSQL);
//
//            System.out.println("Customer table created successfully.");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}