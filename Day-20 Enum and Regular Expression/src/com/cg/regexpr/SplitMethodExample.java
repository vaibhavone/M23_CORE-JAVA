package com.cg.regexpr;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SplitMethodExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//  "//d" belongs to digit
		String delimeter="\\d";
		//String split by digit
		Pattern p=Pattern.compile(delimeter,Pattern.CASE_INSENSITIVE);
		String res[]=p.split(str);
		for(String i:res) 
		{
			System.out.println(i+" ");
		}
		
		sc.close();

	}

}


