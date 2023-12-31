package com.example.finalsdaproject.dbexpender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExpenderCustomerOrder {
    // Define constants for database connection parameters
    private static final String DB_URL = "jdbc:mysql://localhost:3306/sda-ecommerce";
    private static final String DB_USER = "Andre";
    private static final String DB_PASSWORD = "Eumajocpecomp1.";

    // Define constant for SQL statement
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS customer_order ("
            + "order_id INT AUTO_INCREMENT PRIMARY KEY, "
            + "order_date DATE NOT NULL, "
            + "customer_id INT NOT NULL, "
            + "product_id INT NOT NULL, "
            + "quantity INT NOT NULL, "
            + "total_price DECIMAL(10, 2) NOT NULL"
            + ")";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            // Create a Statement object for executing SQL commands
            Statement statement = connection.createStatement();

            // Execute the SQL command to create the new table
            statement.executeUpdate(CREATE_TABLE_SQL);

            System.out.println("Table created successfully.");

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
//public class DBExpenderCustomerOrder {
//    public static void main(String[] args) {
//        String url = "jdbc:mysql://localhost:3306/sda-ecommerce";
//        String user = "Andre";
//        String password = "Eumajocpecomp1.";
//
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            // Create a Statement object for executing SQL commands
//            Statement statement = connection.createStatement();
//
//            // SQL command to create a new table with a different name, e.g., "customer_order"
//            String createTableSQL = "CREATE TABLE IF NOT EXISTS customer_order ("
//                    + "order_id INT AUTO_INCREMENT PRIMARY KEY, "
//                    + "order_date DATE NOT NULL, "
//                    + "customer_id INT NOT NULL, "
//                    + "product_id INT NOT NULL, "
//                    + "quantity INT NOT NULL, "
//                    + "total_price DECIMAL(10, 2) NOT NULL"
//                    + ")";
//
//            // Execute the SQL command to create the new table
//            statement.executeUpdate(createTableSQL);
//
//            System.out.println("Table created successfully.");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}

