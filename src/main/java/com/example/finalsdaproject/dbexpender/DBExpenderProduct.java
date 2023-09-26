package com.example.finalsdaproject.dbexpender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExpenderProduct {
    // Define constants for SQL statements
    private static final String CREATE_TABLE_SQL = "CREATE TABLE IF NOT EXISTS product ("
            + "id BIGINT AUTO_INCREMENT PRIMARY KEY, "
            + "sku VARCHAR(255) NOT NULL, "
            + "name VARCHAR(255) NOT NULL, "
            + "description VARCHAR(255) NOT NULL, "
            + "unit_price DECIMAL(13, 2), "
            + "image_url VARCHAR(255), "
            + "active BIT(1), "
            + "units_in_stock INT, "
            + "date_created DATETIME(6) NOT NULL, "
            + "last_updated DATETIME(6) NOT NULL, "
            + "category_id BIGINT"
            + ")";

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sda-ecommerce";
        String user = "Andre";
        String password = "Eumajocpecomp1.";

        Connection connection = null;
        Statement statement = null;

        try {
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            // Execute the SQL command to create the product table
            statement.executeUpdate(CREATE_TABLE_SQL);

            System.out.println("Product table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close resources in a finally block to ensure they are always closed
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

//package com.example.finalsdaproject.dbexpender;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DBExpenderProduct {
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
//            String createTableSQL = "CREATE TABLE IF NOT EXISTS product ("
//                    + "id BIGINT AUTO_INCREMENT PRIMARY KEY, "
//                    + "sku VARCHAR(255) NOT NULL, "
//                    + "name VARCHAR(255) NOT NULL, "
//                    + "description VARCHAR(255) NOT NULL, "
//                    + "unit_price DECIMAL(13, 2), "
//                    + "image_url VARCHAR(255), "
//                    + "active BIT(1), "
//                    + "units_in_stock INT, "
//                    + "date_created DATETIME(6) NOT NULL, "
//                    + "last_updated DATETIME(6) NOT NULL, "
//                    + "category_id BIGINT"
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