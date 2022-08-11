package com.cg.thiskeyword;
class B
{
	public void accept(B b)
	{
		System.out.println("Accept method");
	}
	public void accept1()
	{
		accept(this);
		
	}
	
}
public class ArgumentMethod {

	public static void main(String[] args) {
		B b=new B();
		b.accept(b);
	}

}
