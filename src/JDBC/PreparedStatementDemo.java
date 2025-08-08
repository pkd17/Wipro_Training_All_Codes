package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement; // Import the correct interface

public class PreparedStatementDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbURL = "jdbc:mysql://localhost:3306/studentrepo";
		String username = "root";
		String password = "admin";

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection(dbURL, username, password);

		String query = "SELECT * FROM students WHERE Name = ?";
		PreparedStatement ps = con.prepareStatement(query); // No need to cast

		ps.setString(1, "shovan");

		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("lastname"));
		}
		con.close();
	}
}
