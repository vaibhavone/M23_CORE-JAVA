package com.cg.inheritance;

class Super
{
	protected int rollno;
	void print()
	{
		System.out.println("hey guys! Whats going on..?");
	}
}
class Subclass extends Super
{
	void accept()
	{
		System.out.println("Roll no is:"+rollno);
	}
	
}
public class Singleinheritance {

	public static void main(String[] args) {
		Subclass s=new Subclass();
		s.rollno=3;
		s.accept();
		s.print();
		

	}

}
