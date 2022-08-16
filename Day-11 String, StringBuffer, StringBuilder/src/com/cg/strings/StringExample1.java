package com.cg.strings;
import java.util.Scanner;

public class StringExample1 {

	public static void main(String[] args) {
		String s1="Sumit Desale";
		System.out.println(s1);
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("write here :");
		String str=sc.nextLine();
		System.out.println(str);
	}

}
	