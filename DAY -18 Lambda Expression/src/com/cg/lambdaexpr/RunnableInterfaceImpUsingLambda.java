package com.cg.lambdaexpr;

public class RunnableInterfaceImpUsingLambda {

	public static void main(String[] args) {
		//runnable interface
//		Runnable R1=new Runnable() 
//		{
//			public void run() 
//			{
//				System.out.println("Runnable interface implementation");
//			}
//			
//		};
		
		//Runnable interface Using Lambda expression 
		Runnable R1=()->
		{
		System.out.println("Runnable interface implementation exp 2");

		};
		Thread t=new Thread(R1);
		t.start();
		

	}

}


