package com.hexaware.cfw;

import java.util.ArrayList;

public class Test3 {

	
	public static void main(String[] args) {
		
	ArrayList<Integer> al = new ArrayList<>();
	
	for(int i =1;i<=10;i++) {
		al.add(i);
	}
	
	
	/*
	 * for(int i=0;i<al.size();i++) 
	 * { 
	 * System.out.println(al.get(i));
	 *  }
	 */
	for(Integer i:al)
	{
		if(i%2==0) {
			System.out.println(i);
		}
	}
	
	
	
	
	}
}
