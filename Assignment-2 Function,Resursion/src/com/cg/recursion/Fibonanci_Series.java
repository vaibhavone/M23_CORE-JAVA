package com.cg.recursion;
import java.util.Scanner;

public class Fibonanci_Series {

	
			static int fibonacciR(int n) 
			{
				if(n==0) {
					return 0;
				}
				if(n==1 || n==2) {
					return 1;
				}
				return fibonacciR(n-2)+fibonacciR(n-1);
				
			}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				
				System.out.println("Fibonacci series of "+n+" is :");
				
				for(int i=0;i<n;i++) 
				{
					System.out.print(fibonacciR(i)+" ");
					
				}
				
				sc.close();
				

			}
}
