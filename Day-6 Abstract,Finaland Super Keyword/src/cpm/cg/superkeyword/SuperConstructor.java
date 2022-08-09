package cpm.cg.superkeyword;
class Android {
	
	
	Android()
	{
		System.out.println("Lava is Android");
	}
	
}
class Lava extends Android
{

	Lava()
	{
		//Android class Constructor
		super();
		System.out.println("Hello Everyone..");
	}
	
}
public class SuperConstructor {

	public static void main(String[] args) {
		Lava l=new Lava();
		

	}

}
