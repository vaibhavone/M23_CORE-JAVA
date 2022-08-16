package com.cg.strings;

public class StringExample3 {

	public static void main(String[] args) {
		
			String str="hello";
			String str1="hello";
			
			System.out.println(str==str1);
			
			String str2=new String("bye");
			String str3=new String("bye");
			
			System.out.println(str2==str3);
			
			System.out.println(str2.equals(str3));
			
		}

	}
	