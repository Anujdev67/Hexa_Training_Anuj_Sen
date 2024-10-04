package com.hexaware.cfw;

import java.util.LinkedHashMap;
import java.util.Map;

public class Test6 {

	public static void main(String[] args) {

		Map m = new LinkedHashMap();
		m.put(100, "rk");
		m.put(300, "hexaware");
		m.put(200, "amit");
		m.put("aditya", 400);
		m.put(null, null);
		m.put(100, "ram");
		m.put(500, "rk");
		m.put(600, "rk");

		for (Object o : m.entrySet()) {
			// type cast
			Map.Entry me = (Map.Entry) o;
			System.out.println(me.getKey() + "  " + me.getValue());

		}

	}

}
