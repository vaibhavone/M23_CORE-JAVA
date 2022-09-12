package com.cg.framework;
public abstract class NormalAcc extends ShopAcc
{
	private  float deliveryCharges=0.0f;

	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges);
	}

	public void bookProduct(float charges) 
	{
		System.out.println("Account NO: "+this.getAccNo()+" "+"Account Name: "+this.getAccNm()+" "+"Charges is: "+(charges+deliveryCharges));
		
	}

}

