package com.cg.exceptionhandling;
public class FinallyDemo {
	
	 public  void print(int[] arr) {
	        System.out.println(arr[3]);
	        System.out.println("Fourth element successfully displayed!");
	    }

	public static void main(String[] args) {
		
		FinallyDemo f=new FinallyDemo();
		  System.out.println("First line");
	        System.out.println("Second line");
	        
	        try {
	        int[] arr = new int[]{1, 2, 3};
	       f. print(arr);
	        System.exit(0);
	      
	        }
	        catch(Exception e)
	        {
	        	System.out.println(e);
	        }
	        //If any statement out of the try and catch block that will be executed
	       
	   
	  
	        finally 
	        {
	        	System.out.println("this is finally");
	        }
	        System.out.println("Third line");
	    }

	}


