package com.hexaware.cfw;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		
		
		List l = new ArrayList();
		l.add(34);
		l.add("ram");
		l.add(true);
		l.add(8.9);
		l.add(34);
		l.add(null);
		
		List l1 = new ArrayList();
		l1.add(456);
		l1.add("ankush");
		l1.add("harika");
		l1.add(false);
		
		
		System.out.println(l);
		System.out.println(l.size());
		System.out.println(l.get(0));
		System.out.println(l.contains(8.97));
		System.out.println(l.indexOf(34));
		System.out.println(l.lastIndexOf(34));
	
		l.addAll(l1);
		System.out.println(l);
		l.removeAll(l1);
		System.out.println(l);
		
		l.remove(0);
		System.out.println(l);
		l.remove(null);
		System.out.println(l);
		
		l.clear();
		
		System.out.println(l);
		
		
	}
}
