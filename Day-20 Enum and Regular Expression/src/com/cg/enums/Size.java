package com.cg.enums;

public enum Size implements PizzaSize
{
	small,medium,large,extralarge;
	
	public void size() 
	{
		System.out.println("size is : "+this);
	}

}
