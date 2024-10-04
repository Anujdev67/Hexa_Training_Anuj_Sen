package com.hexaware.exceptionhandling;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter product weight");
		int productWeight = s.nextInt();

		Test5 test5 = new Test5();
		test5.checkProudct(productWeight);
	}

}
