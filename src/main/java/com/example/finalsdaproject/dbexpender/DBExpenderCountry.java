package com.example.finalsdaproject.dbexpender;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBExpenderCountry {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sda-ecommerce";
        String user = "Andre";
        String password = "Eumajocpecomp1.";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Create a Statement object for executing SQL commands
            Statement statement = connection.createStatement();

            // SQL command to create the customer table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS country ("
                    + "id SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY, "
                    + "code VARCHAR(2) NOT NULL, "
                    + "name VARCHAR(255) NOT NULL"
                    + ")";

            // Execute the SQL command to create the customer table
            statement.executeUpdate(createTableSQL);

            System.out.println("Customer table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}