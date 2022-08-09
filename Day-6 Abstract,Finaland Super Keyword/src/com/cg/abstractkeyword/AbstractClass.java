package com.cg.abstractkeyword;

abstract class Flower
{
	//abstract method
	abstract void print();
	//non-abstract method
	void accept()
	{
	System.out.println("Demo on abstract clss");
}
}
	class Lily extends Flower
	{
		
		void print()
		{
			System.out.println("Hey Folks, i like the fregrance of Lily");
		}
	}

public class AbstractClass {

	public static void main(String[] args) {
		Lily l=new Lily();
		l.print();
		l.accept();
	}

}
