package com.cg.exceptionhandling;
public class IndexArrayOutOfBoundException {

	 public static void print(int[] arr) {
	        System.out.println(arr[4]);
	        System.out.println("Fourth element successfully displayed!");
	        
	    }
	 
	    public static void main(String[] args){ 
	        System.out.println("First line");
	        System.out.println("Second line");
	        
	        try {
	        int[] myIntArray = new int[]{1,2,3,4};
	        print(myIntArray);
	        
	        }	       
	        catch(Exception e)
	       {	        	
	        	 System.out.println(e);
	        }
	        //If any statement out of the try and catch block that will be executed
	        System.out.println("Third line");
	    }
	   
	}

