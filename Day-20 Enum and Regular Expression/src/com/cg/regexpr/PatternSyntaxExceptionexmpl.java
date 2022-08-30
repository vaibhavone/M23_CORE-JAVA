package com.cg.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxExceptionexmpl 
{
	private static String REGEXP="[";
	private static String INPUT="i love mumbai is famous for bollywood city";
	private static String REPLACE ="pune";

	public static void main(String[] args) {
		try {
		      Pattern p=Pattern.compile(REGEXP);
		      
		      Matcher m=p.matcher(INPUT);
		      
		      INPUT=m.replaceAll(REPLACE);
		      
		}
		catch(PatternSyntaxException e)
		{
			
			System.out.println("description "+e.getDescription());
			
			System.out.println("description "+e.getIndex());

		}
		
		
		}

}

