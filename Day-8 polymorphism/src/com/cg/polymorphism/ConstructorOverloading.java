package com.cg.polymorphism;
class Xuv
{
	int speed;
	String engine;
	
	//zero parameter
	Xuv()
	{
		System.out.println("Mahindra XUV");
	}
	//two parameter
	Xuv(int speed, String engine)
	{
		this.speed=speed;
		this.engine=engine;
		System.out.println("Speed is " +speed+ "and the Engine is " +engine);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Xuv x=new Xuv();
		Xuv x1=new Xuv(80,"petrol");
		 

	}

}
