package com.cg.inheritance;

class AndroidVersion
{
	void display1()
	{
		System.out.println("Android Version");
	}
}
class Kitkat extends AndroidVersion
{
	void print()
	{
		System.out.println("Kitkat");
	}
}
class Pie extends AndroidVersion
{
	

    void print1()
{
	System.out.println("Pie");
}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Kitkat k=new Kitkat();
		

	}

}
