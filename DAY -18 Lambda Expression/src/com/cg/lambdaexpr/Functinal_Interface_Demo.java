package com.cg.lambdaexpr;

@FunctionalInterface
interface D
{
	String disaply(String str); //abstract method
}

public class Functinal_Interface_Demo {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		D obj=(String str)->
		{
			return str;
		};
		System.out.println("welcome to lambda expression concept using one parameter");
	}

}


