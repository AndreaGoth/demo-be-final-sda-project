import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseExpander {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sda-eccomerce";
        String user = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            // Create a Statement object for executing SQL commands
            Statement statement = connection.createStatement();

            // SQL command to create a new table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS new_table_name ("
                    + "column1_name datatype1, "
                    + "column2_name datatype2, "
                    + "PRIMARY KEY (column1_name)"
                    + ")";

            // Execute the SQL command to create the new table
            statement.executeUpdate(createTableSQL);

            System.out.println("Table created successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}