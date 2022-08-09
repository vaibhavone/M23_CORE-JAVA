package com.cg.superdemo;

public class BaseTwo extends BaseOne
{
	BaseTwo()
	{
		super();//called tp parennt clSS DAFAULT CONSTRUCTO
		System.out.println("Default Constructor for BaseOne");
	}
	BaseTwo(int i)
	{
		super(i);//called to parameterized constructor
		System.out.println("Parameterised Constructor for BaseOne:" +i);
	}

}
