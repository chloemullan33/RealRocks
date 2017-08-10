package controllers;

/*import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;*/

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Models.Employee;

public class EmployeeController {
	private static final String CONNECTION_STRING = "jdbc:mysql://192.168.1.199:3306/employees";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "unhackable";
	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	
	private static Connection dbConnection = null;
	
	public static ArrayList<Employee> getEmployees() throws SQLException{
		ArrayList<Employee> emps = new ArrayList<Employee>();
		PreparedStatement preparedStatement = null;
		try{  
			
			String query = "SELECT employee_id, fname, lname, age, address_id, nin, bank_acc_info_id FROM employee";
		
			
			System.out.println("Connecting to a selected database...");
			dbConnection = getDBConnection();
			System.out.println("Connected database successfully...");
			
			//here sonoo is database name, root is username and password  
			
			
			preparedStatement = dbConnection.prepareStatement(query);
			
			
			ResultSet rs = preparedStatement.executeQuery(query );
			while (rs.next()) {
				Employee e = new Employee();
				e.name = rs.getString("fname") + " " + rs.getString("lname");
				e.employeeNumber = rs.getInt("employee_id");
				e.natInsurance = rs.getString("nin");
				emps.add(e);
			}
			
			System.out.println("No. of employees found: " + emps.size());
			dbConnection.close();
			
		
		}
	catch(Exception e)
	{ 
		System.out.println(e);
	}
		finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				
			}
		}
	
		
		
		
		return emps;
	}
	
	
	public static ArrayList<Employee> getEmployeesByDepartment(int departmentId) throws SQLException{
		ArrayList<Employee> emps = new ArrayList<Employee>();
		PreparedStatement preparedStatement = null;
		try{  
			
			String query = "SELECT employee_id, fname, lname, age, address_id, nin, bank_acc_info_id FROM employee WHERE dept_id = ?";
		
			
			System.out.println("Connecting to a selected database...");
			dbConnection = getDBConnection();
			System.out.println("Connected database successfully...");
			
			//here sonoo is database name, root is username and password  
			
			
			preparedStatement = dbConnection.prepareStatement(query);
			
			preparedStatement.setInt(1, departmentId);
			
			
			ResultSet rs = preparedStatement.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.name = rs.getString("fname") + " " + rs.getString("lname");
				e.employeeNumber = rs.getInt("employee_id");
				e.natInsurance = rs.getString("nin");
				emps.add(e);
			}
			
			System.out.println("No. of employees found: " + emps.size());
			dbConnection.close();
			
		
		}
	catch(Exception e)
	{ 
		System.out.println(e);
	}
		finally {
			if (preparedStatement != null) {
				preparedStatement.close();
			}

			if (dbConnection != null) {
				
			}
		}
	
		
		
		
		return emps;
	}
	
	
	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {

			Class.forName(DB_DRIVER);

		} catch (ClassNotFoundException e) {

			System.out.println(e.getMessage());

		}

		try {

			dbConnection = DriverManager.getConnection(
                             CONNECTION_STRING, USERNAME,PASSWORD);
			return dbConnection;

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		}

		return dbConnection;

	}

}
