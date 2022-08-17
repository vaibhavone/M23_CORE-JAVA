package com.cg.exceptionhandling;
public class ThrowExample {
	
	static void display() {
		 try {
			System.out.println("first line");
			System.out.println("second line");
			throw new RuntimeException();
			
			}
		 finally
		  {
			  System.out.println("dfbcb");
		  }
	}	

	public static void main(String[] args)
	{
	
		try 
		{
			display();
		}
	 	catch (Exception e) 
		{
			System.out.println("third line");
		}
		
	}

}