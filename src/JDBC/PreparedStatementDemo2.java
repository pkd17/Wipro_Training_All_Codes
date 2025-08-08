package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement; 

public class PreparedStatementDemo2 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbURL = "jdbc:mysql://localhost:3306/studentrepo";
		String username = "root";
		String password = "admin";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(dbURL, username, password);
		
		
		String insertSQL="INSERT INTO students (studentId, Name, lastname,Gender, Marks) VALUES (?, ?, ?, ?,?)";
		PreparedStatement pi=con.prepareStatement(insertSQL);
		pi.setInt(1,25);
		pi.setString(2,"Prasant");
		pi.setString(3, "Male");
		pi.setString(4, "Jena");
        pi.setInt(5, 58);
        
        int rowsInserted=pi.executeUpdate();
        System.out.println(rowsInserted);
		
		

		String query = "SELECT * FROM students WHERE Name = ? and marks=?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setString(1, "Prasant");
		ps.setInt(2, 58);

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			
			int id = rs.getInt("studentId");
            String fname = rs.getString("Name");
            String lname = rs.getString("lastname");
            int marks = rs.getInt("Marks");
            
            System.out.println("ID: " + id + ", Name: " + fname + " " + lname + ", Marks: " + marks);
            
            System.out.println("Name");
            System.out.println("lastname");
            System.out.println("marks");
		}
		con.close();
	}
}

