package com.cg.strings;
import java.util.StringTokenizer;

public class String_Tokenizer_Exmple {

	public static void main(String[] args) {
    StringTokenizer st=new StringTokenizer("have a gud day");
		
		while(st.hasMoreTokens()) 
		{
			System.out.println(st.nextToken());

		}

	}
}