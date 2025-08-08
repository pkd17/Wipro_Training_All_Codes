package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String dbURL="jdbc:mysql://localhost:3306/studentrepo";
		String username="root";
		String password="admin";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		Connection con=DriverManager.getConnection(dbURL,username,password);
		//Create the statement object
		Statement st=con.createStatement();
		
		String selectquery="select * from students;";
		
		ResultSet rs=st.executeQuery(selectquery);
		
		
		
         
		while(rs.next()) {
		/*	System.out.println(rs.getString("Name"));
			System.out.println(rs.getString("Gender"));
			System.out.println(rs.getInt("Marks"));
			*/
			
			//fetch Person Id
			int id=rs.getInt("PersonID");
			
			System.out.println(id);
			
			//fetch Firstname
			
			
		}
		
			
	}

}
