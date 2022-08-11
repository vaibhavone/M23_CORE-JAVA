package instanceofoperator;
class A
{
	
}
public class ChildIntancee extends A
{

	public static void main(String[] args) {
		ChildIntancee c=new ChildIntancee();
		
		//here it will print true because main class is inheritated property of class A
		System.out.println(c instanceof A);

	}

}

