package com.cg.polymorphism;

class Multiplication
{
	void accept(int a, int b)
	{
		System.out.println(a*b);
	}
}
class Mult extends Multiplication
{
	void accept(int x, int y)
	{
		System.out.println(x*y);
	}
}
public class compileTime {

	public static void main(String[] args) {
		Mult m=new Mult();
		m.accept(10,12);
		Multiplication m1=new Multiplication();
		m1.accept(5,10);

	}

}
