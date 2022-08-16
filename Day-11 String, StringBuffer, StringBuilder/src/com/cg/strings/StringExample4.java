package com.cg.strings;

import java.util.Scanner;

public class StringExample4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1="Dhoni";
		System.out.println("enter name :");
		String s2=sc.nextLine();
		
		if(s1.equals(s2)) 
		{
			System.out.println("Matching");
		}
		else 
		{
			System.out.println("Not Matching");
		}
		
		sc.close();
	}

}
