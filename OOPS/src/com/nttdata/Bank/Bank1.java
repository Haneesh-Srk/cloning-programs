package com.nttdata.Bank;

public class Bank1 {

	private String bankName;
	private int bankCode;
	public Bank1(String bankName, int bankCode) {
		super();
		this.bankName = bankName;
		this.bankCode = bankCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	
	public void displayBankDetails()
	{
		System.out.println("Details of Bank are");
		System.out.println("Bank name is "+bankName+" \t"+"Bank code is "+bankCode);
		//System.out.println("Account id id "+account.getAccountId()+" \t"+"Account holder name "+account.getUserName());
		//System.out.println("Account balance is "+account.getBalance());
	}
}
