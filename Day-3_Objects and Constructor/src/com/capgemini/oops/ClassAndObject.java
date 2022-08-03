package com.capgemini.oops;
//program on how to use the class and object

class Car
{
	int a; //variable
	void display()//method
	{
		System.out.println("Welcome to M23 Batch");
	}
	}

public class ClassAndObject {

	public static void main(String[] args) {
		//object creation
		Car c= new Car();
		//accessing the car class method
		c.display();
		//assign the value
		c.a=33;
		//accessing car class variable
		System.out.println(c.a);
	}

}
