package com.cg.exceptionhandling;

public class ThrowDemo {

	public static void display(int age, int weight) throws Exception {
		if (age > 18 && weight > 45)
			System.out.println("Eligible to donate Blood");
		else {
			throw new RuntimeException("Exception Caught");
		}
	}

	public static void main(String[] args) {

	}
}
