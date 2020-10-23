package com.nttdata.Exception;

public class Bank {

	private String bankName;
	private int bankCode;
	public Account account;
	
	public Bank(String bankName, int bankCode, Account account) {
		super();
		this.bankName = bankName;
		this.bankCode = bankCode;
		this.account = account;
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

	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}


	public void displayBankDetails()
	{
		System.out.println("Details of Bank are");
		System.out.println("Bank name is "+bankName+" \t"+"Bank code is "+bankCode);
		System.out.println("Account id id "+account.getAccountId()+" \t"+"Account holder name "+account.getUserName());
		System.out.println("Account balance is "+account.getBalance());
	}
}
