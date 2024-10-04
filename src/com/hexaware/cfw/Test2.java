package com.hexaware.cfw;

import java.util.ArrayList;

public class Test2 {

	
	public static void main(String[] args) {
		
	ArrayList al = new ArrayList();
	
	for(int i =1;i<=10;i++) {
		al.add(i);
	}
	
	//al.add("rama");
	/*
	 * for(int i=0;i<al.size();i++) 
	 * { 
	 * System.out.println(al.get(i));
	 *  }
	 */
	for(Object i:al)
	{
		//type casting from Object to Integer(parent to child)-> downcasting
		Integer x = (Integer)i;
		if(x%2==0) {
			System.out.println(x);
		}
	}
	
	
	
	
	}
}
