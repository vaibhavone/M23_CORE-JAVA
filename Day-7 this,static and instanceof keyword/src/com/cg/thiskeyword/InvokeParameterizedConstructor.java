package com.cg.thiskeyword;
class abc

{
	public int x;
	//default constructor 
	abc()
	{
		this(10); //invoking parameterized constructor 
		System.out.println("default constructor "); 

	}
	//parameterized constructor 
	abc(int  x)
	{
	
		System.out.println("parameterized constructor "+x); 
	}
}
public class InvokeParameterizedConstructor {

	public static void main(String[] args) {
		 @SuppressWarnings("unused")
			abc obj=new abc();


	}

}


