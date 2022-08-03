package com.capgemini.oops;

import java.util.Scanner;

class Car1
{
	int a; //variable
	void display()//method
	{
		System.out.println("Welcome to M23 Batch");
	}
	}

public class RuntimeClassAndObject {

	public static void main(String[] args) {
		
		Car c=new Car();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Value For a:");
		//int a=sc.nextInt();
		c.a=sc.nextInt();
		
	
		c.display();
		
		System.out.println(c.a);
		sc.close();
		
		
	}

}
