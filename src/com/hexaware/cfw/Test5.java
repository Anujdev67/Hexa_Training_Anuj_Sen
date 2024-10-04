package com.hexaware.cfw;

import java.util.SortedSet;
import java.util.TreeSet;

public class Test5 {
	
	public static void main(String[] args) {
		
		SortedSet<Student> s = new TreeSet<>(new StudentNameComparator());
		
		Student priyanshu = new Student(100,"priyanshu");
		Student krishna = new Student(898,"krishna");
		Student sakshi = new Student(78,"sakshi");
		s.add(priyanshu);
		s.add(krishna);
		s.add(sakshi);
		
		
		System.out.println(s);
	}

}
