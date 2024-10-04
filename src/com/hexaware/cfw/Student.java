package com.hexaware.cfw;

public class Student implements Comparable<Student> {
	private Integer stid;
	private String stname;
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public Student()
	{
		
	}
	
	@Override
	public String toString()
	{
		return stid + " " +stname;
	}
	public Student(Integer stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	@Override
	public int compareTo(Student o) {
		
		//return o.getStid().compareTo(this.getStid());
	    return o.getStname().compareTo(this.getStname());
		
		/*
		 * if(this.getStid() > o.getStid()) { return +8; } else if(this.getStid() <
		 * o.getStid()) { return -8;
		 * 
		 * } else { return 0; }
		 */
	}

}
