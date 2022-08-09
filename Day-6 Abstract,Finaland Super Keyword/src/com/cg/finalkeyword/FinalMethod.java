package com.cg.finalkeyword;

class A {
	A() {
		System.out.println("Constructor");
	}
	
//	final public void accept() 

	 public void accept() {
		System.out.println("Parent Class");
	}
}

class B extends A
{
	
public void accept()
{
	System.out.println("Parent Class");
}
}
public class FinalMethod {

	public static void main(String[] args) {
		

	}
}  

