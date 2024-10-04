package com.hexaware.encapsulation;

public class Student {
	
	private int stid;
	private String stname;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		if(stid > 0 )
		this.stid = stid;
		else
			System.out.println("Student id must be positive");
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	
	
	
	
}
