package com.cg.interfacedemo;

interface Father
{
	void property();
}
interface Mother
{
	void love();
}
class Daughter implements Father,Mother
{

	@Override
	public void love() {
		System.out.println("Mother loves their Child");
		
	}

	@Override
	public void property() {
		System.out.println("Father gives property to Child");
	
		
	}
	
}

public class MultipleInterfaceUsingInterface {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.love();
		d.property();
		

	}

}
