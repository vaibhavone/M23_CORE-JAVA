package com.cg.application;


import com.cg.framework.BankFactory;
import com.cg.framework.CurrentAcc;
import com.cg.framework.SavingAcc;

public class MMBankFactory extends BankFactory
{

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float isSalaried)
	{
		MMCurrentAcc mc=new MMCurrentAcc(accNo, accNm, accBal, isSalaried);
		return mc;
	}

	@Override
	public SavingAcc  getNewSavingAcc(int accNo, String accNm, float accBal, boolean creditLimit) 
	{
		MMSavingAcc ms=new MMSavingAcc(accNo, accNm, accBal, creditLimit);
		return ms;
	}

	
}

