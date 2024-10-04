//package com.hexaware.jdbc;
//
//import java.sql.Connection;
//import.java.sql.ResultSet;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class Test1 {
//	
//	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		
//		//load the driver class
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		
//		System.out.println("driver class loaded");
//		
//		//get the connection 
//		
//		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "123456");
//		
//		System.out.println("i got the connection");
//		
//		Statement statement = connection.createStatement();
//		// insrt query on hexaware schema
////		int x = statement.executeUpdate("insert into trainee values(7,'Lucas',801,'Java Full Stack','rk')");
////		
////		System.out.println(x + "row(s) inserted");
//		
//		//close the connection 
//		
//		  String selectQuery = "SELECT id, name, course_id, course_name, trainer FROM trainee";
//		  ResultSet resultSet = statement.executeQuery(selectQuery);
//
//	        // 5. Process the results and print them to the console
////	        System.out.println("ID | Name   | Course ID | Course Name     | Trainer");
////	        System.out.println("---------------------------------------------------");
//	        while (resultSet.next()) {
//	            int id = resultSet.getInt("id");
//	            String name = resultSet.getString("name");
//	            int courseId = resultSet.getInt("course_id");
//	            String courseName = resultSet.getString("course_name");
//	            String trainer = resultSet.getString("trainer");
//
//	            // Output the result row by row
//	            System.out.println(id + "  | " + name + "  | " + courseId + "       | " + courseName + " | " + trainer);
//	        }
////		connection.close();
////		
////	}
////
////}
//	        resultSet.close();
//	        statement.close();
//	        connection.close();
//	        
//	        System.out.println("Connection closed");
//	    }
//	}



package com.hexaware.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;  // Import ResultSet
import java.sql.SQLException;
import java.sql.Statement;

public class Test1 {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        // Load the driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        System.out.println("Driver class loaded");
        
        // Get the connection
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "123456");
        
        System.out.println("Connection established");
        
        // Create a statement object
        Statement statement = connection.createStatement();
        
        // Execute the SELECT query
        String selectQuery = "SELECT id, name, course_id, course_name, trainer_name FROM trainee";
        ResultSet resultSet = statement.executeQuery(selectQuery);

        // Process the results and print them to the console
        System.out.println("ID | Name   | Course ID | Course Name     | Trainer");
        System.out.println("---------------------------------------------------");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int courseId = resultSet.getInt("course_id");
            String courseName = resultSet.getString("course_name");
            String trainer_name = resultSet.getString("trainer_name");

            // Output the result row by row
            System.out.println(id + "  | " + name + "  | " + courseId + "       | " + courseName + " | " + trainer_name);
        }

        // Close the resources
//        resultSet.close();
//        statement.close();
        connection.close();
        
        System.out.println("Connection closed");
    }
}
