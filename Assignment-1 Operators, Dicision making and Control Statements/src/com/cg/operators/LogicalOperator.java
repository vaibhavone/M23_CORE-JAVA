package com.cg.operators;

public class LogicalOperator {

	public static void main(String[] args) {
		int a = 3, b = 4;
		boolean res = (a > b && b < a);
		boolean res2 = (a > b || b > a);
		boolean res3 = !(a > b);
		System.out.println(res);
		System.out.println(res2);
		System.out.println(res3);
	}

}
