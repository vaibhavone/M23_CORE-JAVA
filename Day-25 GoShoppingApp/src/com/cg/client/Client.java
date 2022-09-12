package com.cg.client;

import com.cg.application.GSNormalAcc;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class Client {

	public static void main(String[] args)
	{
		ShopFactory s=new GSShopFactory();
		PrimeAcc p= new GSPrimeAcc(1001,"Sumit Desale",1000, true);
		NormalAcc n=new GSNormalAcc(1002,"vaibhav jadhav",1000, 50);
		System.out.println("Prime Account: ");
		p.bookProduct(1000);
		
		System.out.println("Normal Account: ");
		n.bookProduct(1000);
		
		System.out.println(p);
		System.out.println(n);
	}

}

