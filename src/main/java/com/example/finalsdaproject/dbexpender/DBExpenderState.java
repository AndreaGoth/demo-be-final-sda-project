package com.example.finalsdaproject.dbexpender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExpenderState {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sda-ecommerce";
        String user = "Andre";
        String password = "Eumajocpecomp1.";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Create a Statement object for executing SQL commands
            Statement statement = connection.createStatement();

            // SQL command to create the customer table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS state ("
                    + "id SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, "
                    + "name VARCHAR(255) NOT NULL, "
                    + "country_id SMALLINT UNSIGNED"
                    + ")";

            // Execute the SQL command to create the customer table
            statement.executeUpdate(createTableSQL);

            System.out.println("Customer table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}