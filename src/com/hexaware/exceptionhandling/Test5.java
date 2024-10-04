package com.hexaware.exceptionhandling;

public class Test5 {

	public void checkProudct(int weight) {
		if (weight > 100) {
			System.out.println("product is valid");
		} else {
			try {
				throw new InvalidProductException();
			} catch (InvalidProductException ip) {
				System.out.println("product weight must be greater than 100");
			}
		}
	}

}
