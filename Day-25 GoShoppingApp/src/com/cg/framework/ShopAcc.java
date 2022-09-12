package com.cg.framework;

public abstract class ShopAcc {
	private int AccNo;
	private String accNm;
	private float charges;

	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		AccNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	public int getAccNo() {
		return AccNo;
	}

	public void setAccNo(int accNo) {
		AccNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}

	@Override
	public String toString() {
		return "ShopAcc [AccNo=" + AccNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}

	abstract public void bookProduct(float charges);

	public void items(float charges) {
		System.out.println(charges);
	}

}
