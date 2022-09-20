package com.cg.client;

import com.cg.application.MMBankFactory;
import com.cg.application.MMCurrentAcc;
import com.cg.application.MMSavingAcc;
import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class Client {
	public static void main(String[] args) 
	{
		BankFactory s=new MMBankFactory();
		SavingAcc p=new MMSavingAcc(1001,"Vaibhav Jadhav",112758, true);
		CurrentAcc n=new MMCurrentAcc(1002,"Harish Jadhav",16598, 50);
		System.out.println("Saving Account: ");
		p.withdraw(500);
		
		System.out.println("Current Account: ");
		n.withdraw(500);
		System.out.println(p);
		System.out.println(n);

}
}

