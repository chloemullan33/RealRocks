package controllers;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;

import Models.Employee;

public class EmployeeController {
	
	public static ArrayList<Employee> getEmployees(){
		
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.199:3306/employees","root","unhackable");  
		//here sonoo is database name, root is username and password  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from employee");  
		while(rs.next())  
		System.out.println(rs.getInt(1));  
		con.close();  
		}
	catch(Exception e)
	{ System.out.println(e);
	}
	
		
		
		
		return new ArrayList<Employee>();
	}

}
