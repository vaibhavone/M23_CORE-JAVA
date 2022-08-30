package com.cg.lambdaexpr;


interface A
{
	void print(); //abstract method
}
//class B implements A
//{
//	public void print() 
//	{
//		System.out.println("Functional interface implimentation without using lamba expression");
//		
//	}
//}

public class FunctionalInterfaceImpl {

	public static void main(String[] args) {
		//B obj=new B();
		//obj.print();
		
		//lamba expression impliments the functional implimentation thats means one abstarct method
		//length of code decreased using lambda expression
		A obj=()->
		{
			System.out.println("Functional interface implimentation Using lamba expression");
		};
		obj.print();
	}

}

