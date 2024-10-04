package com.hexaware.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatchEx {
	
		
		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			
			// loading mysql Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//  connection to the database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware", "root", "123456"); 
			
			// Create a Statement object
			Statement statement = connection.createStatement();
			
			// Adding SQL statements to batch (Inserting, Updating, Deleting)
			statement.addBatch("INSERT INTO trainee (id, name, course_id, course_name, trainer_name) VALUES (10, 'Gujju', 801, 'Java Full Stack', 'rk')");
			statement.addBatch("INSERT INTO trainee (id, name, course_id, course_name, trainer_name) VALUES (11, 'Suzie', 802, 'Python Full Stack', 'papparazi')");
			statement.addBatch("UPDATE trainee SET trainer_name='R Krishna' WHERE id=10");
			statement.addBatch("DELETE FROM trainee WHERE id=11");
			
			// Execute the batch of SQL statements
			int[] result = statement.executeBatch();
			
			// Display results
			System.out.println(result[0] + " row(s) inserted");
			System.out.println(result[1] + " row(s) inserted");
			System.out.println(result[2] + " row(s) updated");
			System.out.println(result[3] + " row(s) deleted");
			
			// Close the connection
			connection.close();
		}
	}



