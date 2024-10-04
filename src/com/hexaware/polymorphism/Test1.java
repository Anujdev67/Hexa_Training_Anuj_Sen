package com.hexaware.polymorphism;

public class Test1 {

	public void sum(int x, int y)
	{
		System.out.println("integer sum: " + (x+y));
	}
	
	public void sum(double x, double y)
	{
		System.out.println("double sum: " + (x+y));
	}
	
	public static void main(String[] args) {
		
		Test1 obj ; 
		obj = new Test1();
		obj.sum(4, 5);
		obj.sum(5.6, 4.5);
	}
}
