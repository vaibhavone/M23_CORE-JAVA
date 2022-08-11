package com.cg.thiskeyword;
class A
{
	public int num;
	A()
	{
		System.out.println("Welcome to M23 Batch");
	}
	A(int num)
	{
		this.num=num;
		
	}
}
public class InstanceConstructor {

	public static void main(String[] args) {
		A a=new A();
		A a1=new A(5);
		System.out.println(a1.num);

	}

}
