package com.cg.finalkeyword;

class Cat
{
	String name;
	//final method is inheritate but not override
	final void print(String name)
	{
		System.out.println("My name is : " +name);
	}
}
class Audi extends Cat
{
	
}
public class FinalInheritateMethod {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");
		

	}

}
