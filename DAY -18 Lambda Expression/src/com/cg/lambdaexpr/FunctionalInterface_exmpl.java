package com.cg.lambdaexpr;

@FunctionalInterface
interface E
{
	int add(int a,int b); //abstract method
}
public class FunctionalInterface_exmpl {

	public static void main(String[] args) {
		//lambda expression with return statement
//		E obj=(int a,int b)->
//		{
//			return a+b;
//		};
//		System.out.println(obj.add(12, 24));

		
		//lambda expression without using return statement

		E obj=(int a,int b)->(a+b);
		System.out.println("addition is  "+obj.add(12, 30));
	}

}

