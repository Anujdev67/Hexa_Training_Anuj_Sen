package com.hexaware.cfw;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test7 {
	
	public static void main(String[] args) {

		Map<Integer,String> m = new LinkedHashMap<>();
		m.put(100, "rk");
		m.put(200, "hexaware");
		m.put(300, "amit");
		m.put(400, "hemanth");
		m.put(500, "kavitha");
		m.put(600, "rese");

		for (Map.Entry<Integer,String> me : m.entrySet()) {
			
			System.out.println(me.getKey() + "  " + me.getValue());

		}
	}

}
