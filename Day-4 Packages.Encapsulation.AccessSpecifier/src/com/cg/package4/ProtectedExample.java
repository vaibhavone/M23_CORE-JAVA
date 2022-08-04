package com.cg.package4;

class Car {
	protected int a=15;
	// if any variable and method is protected we can access inside the child class
	protected void print() {
		System.out.println(" Hey i am Using Accaess Specifier");
	}
}

class Mercedes extends Car {
	void print1() {
		System.out.println(a);
	}
//Mercedes class is accessing the properties of Car class
}
class D
{
	int a;
}

public class ProtectedExample {

	public static void main(String[] args) {
		Mercedes m = new Mercedes();
		m.print();
		ProtectedExample e= new ProtectedExample();
		D d=new D();
		System.out.println(d.a);
		m.print1();

	}

}
