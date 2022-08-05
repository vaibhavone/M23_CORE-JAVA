package com.cg.inheritance;
class Bike
{
	protected int speed;
	void display() {
		System.out.println("i like to Ride Bike");
	}
}
class Pulser extends Bike
{
	protected String color;
	void print()
	{
		System.out.println("Speed is:"+speed);
	}
}
class Pulser150 extends Pulser
{
	void accept() {
		System.out.println("Color is:"+color);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		Pulser150 p=new Pulser150();
		p.color="Black";
		p.speed=80;
		p.accept();
		p.display();
		p.print();
		
	}

}
