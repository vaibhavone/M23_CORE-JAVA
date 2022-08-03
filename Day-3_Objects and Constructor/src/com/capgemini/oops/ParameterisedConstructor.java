package com.capgemini.oops;

class Pulser
{
	int speed;
	String color;
	Pulser(int speed,String color)
	{
		speed=50;
		color="Black";
	}
	void display()
	{
		System.out.println("Speed is: "+speed+"km.hr" + " and color is: "+color);
	}
}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		
		Pulser p=new Pulser(50,"Black");
		p.display();
	}

}
