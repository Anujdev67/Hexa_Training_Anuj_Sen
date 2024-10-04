package com.hexaware.encapsulation;

public class Test1 {
	
	public static void main(String[] args) {
		
		Student student = new Student();
		
	   student.setStid(-100);
	   student.setStname("ram");
	   System.out.println("student id is: " + student.getStid());
	   System.out.println("student name is: " + student.getStname());
	}
}
