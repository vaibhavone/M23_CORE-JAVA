package com.cg.exceptionhandling;

class CustomException extends Exception{
	private int detail;
	
	public CustomException(int detail)
	{
		super();
		this.detail=detail;
	}
	public CustomException(String message)
	{
		super(message);
	}
	@Override
	public String toString() {
		return "CustomException [detail=" + detail + "]";
	}
}
public class UserException {
	static void accept(int a)throws CustomException
	{
		if(a>10)
			throw new CustomException(a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		try 
		{
			accept(11);
		}
		catch(CustomException e)
		{
			System.out.println("Vaibhav "+e);
		}

	}

}
