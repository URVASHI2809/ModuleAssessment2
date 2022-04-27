package com.rakuten;

public class PensionDetail {
	
	public PensionDetail(float pensionAmount, int bankCharge) {
		super();
		this.pensionAmount = pensionAmount;
		this.bankCharge = bankCharge;
	}
	
	private float pensionAmount;
	private int bankCharge;
	public float getPensionAmount() {
		return pensionAmount;
	}
	public void setPensionAmount(float pensionAmount) {
		this.pensionAmount = pensionAmount;
	}
	public int getBankCharge() {
		return bankCharge;
	}
	public void setBankCharge(int bankCharge) {
		this.bankCharge = bankCharge;
	}
}
