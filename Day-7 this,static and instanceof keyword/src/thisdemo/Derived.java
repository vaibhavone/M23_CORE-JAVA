package thisdemo;
public class Derived extends Base1
{
	Derived()
	{
		System.out.println("Default constructor for Derived class");
	}
	Derived(int i)
	{
	
		this();
		System.out.println("Parameterized constructor for Derived class" +i);
	}
}

