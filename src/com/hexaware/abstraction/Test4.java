package com.hexaware.abstraction;

//execution logic class
public class Test4 {

	public static void main(String[] args) {
		
		/*
		 * Test1 obj = new Test3(); obj.sum(4, 5);
		 */
		
		Bank icici = new Icici();
		System.out.println("icici rateofinterest is: " + icici.getRateOfInterest());
		Bank sbi  = new SBI();
		System.out.println("sbi reateofinterest is: " + sbi.getRateOfInterest());
		
	}
}
