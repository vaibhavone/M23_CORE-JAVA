package com.cg.client;

import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;

import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client 
{
	public static void main(String[] args)
	{
	
	
	SavingAcc   ms= new MMSavingAcc(1001,"vaibhav",3500, true);
	
	
	CurrentAcc mc= new MMCurrentAcc(1002,"isha",5000,2500);
	
	
	System.out.println("Saving Account : ");
	ms.withdraw(100);
	
	System.out.println("Current Account : ");
	mc.withdraw(3000);
	
	
	}
	
}