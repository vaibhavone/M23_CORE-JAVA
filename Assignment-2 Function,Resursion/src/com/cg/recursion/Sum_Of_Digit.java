package com.cg.recursion;
import java.util.Scanner;
public class Sum_Of_Digit {

	
			 static int sum(int n) 
				{
					if(n==0)
						return 0;
					else
						return (n%10 + sum(n/10));
					
					
				}

			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int n=sc.nextInt();
				
				System.out.println("Sum of digit "+n+" is :");
				System.out.println(sum(n));
				
				sc.close();
				

			}

		}

