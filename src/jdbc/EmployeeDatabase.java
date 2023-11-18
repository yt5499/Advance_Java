package jdbc;

import java.io.*;
import java.sql.*;

public class EmployeeDatabase {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name,company;
		int emp_id,salary;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","yash","root");
			stmt = conn.createStatement();
			String query = "SELECT * FROM employee";
			rs = stmt.executeQuery(query);
			
//			display all values
			while(rs.next()) {
				name = rs.getString("Name");
				emp_id = rs.getInt("Emp_ID");
				salary = rs.getInt("Salary");
				company = rs.getString("Company");
				
				System.out.print("Name: "+name);
				System.out.print("Emp_ID: "+emp_id);
				System.out.print("Salary: "+salary);
				System.out.print("Company: "+company);
				System.out.println();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
