package com.cg.lambdaexpr;

interface C
{
	void display();
	//void accept();
}
public class InterfaceImpl {

	public static void main(String[] args) {
		//the target type of this expression must be functional interface
		//that means we can only use one abstarct method
		C obj=()->
		{
			System.out.println("example");
		};
		obj.display();

	}

}

