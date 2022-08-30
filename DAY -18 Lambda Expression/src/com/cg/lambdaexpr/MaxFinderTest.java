package com.cg.lambdaexpr;

public class MaxFinderTest {

	public static void main(String[] args) {
		MaxFinder obj=(a,b)->a>b?a:b;
		int res=obj.maximum(23,40);
		System.out.println(res);
	}

}

