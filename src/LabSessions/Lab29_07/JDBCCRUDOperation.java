package Lab29_07;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCCRUDOperation {

    public static void main(String[] args) throws SQLException, ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "admin"; 

            // Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            //CREATE TABLE
            String createTable = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "department VARCHAR(50), " +
                    "salary DOUBLE)";
            stmt.executeUpdate(createTable);

            //INSERT DATA
            String insert = "INSERT INTO employees (id, name, department, salary) VALUES " +
                    "(101, 'Alice', 'HR', 50000), " +
                    "(102, 'Bob', 'IT', 65000), " +
                    "(103, 'Charlie', 'Sales', 60000)";
            stmt.executeUpdate("DELETE FROM employees"); // clear previous data if any
            stmt.executeUpdate(insert);

            //SELECT ALL
            System.out.println("All Employees:");
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " +
                                   rs.getString("name") + "  " +
                                   rs.getString("department") + "  " +
                                   rs.getDouble("salary"));
            }

            //SELECT WHERE id = 102
            System.out.println("\nEmployee with ID 102:");
            rs = stmt.executeQuery("SELECT * FROM employees WHERE id = 102");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " +
                                   rs.getString("name") + "  " +
                                   rs.getString("department") + "  " +
                                   rs.getDouble("salary"));
            }

            //SELECT WHERE department = 'IT'
            System.out.println("\nEmployees in IT Department:");
            rs = stmt.executeQuery("SELECT * FROM employees WHERE department = 'IT'");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "  " +
                                   rs.getString("name") + "  " +
                                   rs.getString("department") + "  " +
                                   rs.getDouble("salary"));
            }

            // UPDATE salary where id = 102
            stmt.executeUpdate("UPDATE employees SET salary = 70000 WHERE id = 102");

            //UPDATE department where name = 'Alice'
            stmt.executeUpdate("UPDATE employees SET department = 'Finance' WHERE name = 'Alice'");

            //DELETE WHERE id = 103
            stmt.executeUpdate("DELETE FROM employees WHERE id = 103");

            //DELETE WHERE department = 'Sales'
            stmt.executeUpdate("DELETE FROM employees WHERE department = 'Sales'");

            System.out.println("\nFinal Table:");
            rs = stmt.executeQuery("SELECT * FROM employees");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " " +
                                   rs.getString("name") + "  " +
                                   rs.getString("department") + "  " +
                                   rs.getDouble("salary"));
            }
            stmt.close();
            con.close();

       
        }
    }
