package com.cg.enums;

import java.util.Scanner;

enum Movie 
{
	//enums Constants
	kgf,URI,Pushpa,Major;
}
public class EnumWithSwitchCase {
	 //enum variable
	static Movie movie;
	//constructor for the "EnumWithSwitchCase" 
	
	@SuppressWarnings("static-access")
	public EnumWithSwitchCase(Movie movie) 
	{
		this.movie=movie;
	}
	
	public void display() 
	{
		switch(movie) 
		{
		case kgf:
			System.out.println("yash and Shrinidhi Shetty");
			break;
		case URI:
			System.out.println("vicky kaushal and yami gautam");
			break;
		case Pushpa:
			System.out.println("Allu arjun and rashmika");
			break;
		case Major:
			System.out.println("adivi sesh and sai manjrekar");
		
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter movie name : ");
		String str=sc.nextLine();
		@SuppressWarnings("static-access")
		EnumWithSwitchCase obj=new EnumWithSwitchCase(movie.valueOf(str));
		obj.display();
		
		sc.close();
		

	}

}

