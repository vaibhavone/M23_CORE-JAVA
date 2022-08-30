package com.cg.regexpr;

import java.util.Scanner;
import java.util.regex.Pattern;

public class MatchesMethod {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		String pattern="sky";
		String input=sc.nextLine();
		boolean result=Pattern.matches(pattern, input);
		System.out.println(result);

	}

}


