package cpm.cg.superkeyword;
class Color
{
	protected String name="Orange";
	protected void display() {
		System.out.println("Color is : "+ name);
	}
}

class Blue extends Color
{
	public String name="Blue";
	
	public void display()
	{
		System.out.println("Color is :" +name);
		System.out.println(super.name);
	}
}
public class SuperVariable {

	public static void main(String[] args) {
		Blue b=new Blue();
		System.out.println(b.name);
		

	}

}
