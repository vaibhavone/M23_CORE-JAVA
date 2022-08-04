package com.capgemini.oops;

class animal {
	int a;

	animal() 
	{
		a = 15;
	}

	void display()
	{
		System.out.println(a);
	}

public class nonparameterisedConstructor {

	public void main(String[] args) {
		animal an=new animal();
		an.display();

	}
}
}
