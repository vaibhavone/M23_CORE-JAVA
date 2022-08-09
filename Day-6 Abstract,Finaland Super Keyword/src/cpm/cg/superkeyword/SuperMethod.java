package cpm.cg.superkeyword;
class A
{
	protected int Pin;
	public void display(int Pin)
	{
		System.out.println("Pin is:" +Pin);
	}
}
class B
extends A
{
	public int Pin;
	public void display(int Pin)
	{
		System.out.println("Pin is: " +Pin);
	}
	public void print() {
		display(2442);//child class method
		super.display(4554);//parent class method
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		B b=new B();
		b.print();

	}

}
