package com.cg.exceptionhandling;
public class NullPointerExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String str=null;
		try
		{
			str.equals("java");
		}
		catch(Exception e) 
		{
			System.out.println("Exception Handle "+e);
		}
		

	}

}

