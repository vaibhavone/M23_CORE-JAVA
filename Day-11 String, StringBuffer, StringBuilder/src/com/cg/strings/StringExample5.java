package com.cg.strings;
import java.util.Scanner;
public class StringExample5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter word :");
		String s2=sc.nextLine();
		
		System.out.println(" length of th word is : "+s2.length());
		System.out.println(" "+s2.charAt(3));
		System.out.println("Upper case : "+s2.toUpperCase());

		sc.close();
	}

}