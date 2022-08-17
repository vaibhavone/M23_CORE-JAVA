package com.cg.exceptionhandling;
import java.util.Scanner;

public class ArithmaticException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=10;
		System.out.println("Enter value for b");
		int b =sc.nextInt();
		int res=a/b;
		sc.close();
		System.out.println(res);
	}

}
