package com.cg.regexpr;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternCompileAndMatcherMethod {

	public static void main(String[] args) 
	{
		Pattern p=Pattern.compile("my");
		Matcher m=p.matcher("abc is my name  ");
		//it will check "my" location until last and it will print
		while(m.find()) 
		{
			System.out.println("pattern found from : "+m.start()+" to "+(m.end()-1));
		}
		

	}

}


