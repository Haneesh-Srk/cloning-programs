package com.nttdata.Interest;

public abstract class Bank {

	private String bankName;
	private int bankCode;
	
	public Bank(String bankName, int bankCode) {
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
	
	void displayBankDetails(Bank bank)
	{
		if(bank instanceof PublicBank)
		{
			PublicBank p1=(PublicBank)bank;
			System.out.println("Bank details are ");
			System.out.println("Bank name "+p1.getBankName()+" \t"+"Bank code "+p1.getBankCode()+" \t"+"Bank type "+p1.getBankType()+" \t"+
			"Loan interest "+p1.getLoanInterest()+" \t"+"Account no "+p1.account.getAccountId()+" \t"+"Balance is "+p1.account.getBalance());
		}
		else
		{
			PrivateBank p2=(PrivateBank)bank;
			System.out.println("Bank details are ");
			System.out.println("Bank name "+p2.getBankName()+" \t"+"Bank code "+p2.getBankCode()+" \t"+"Bank type "+p2.getBankType()+" \t"+
			"Loan interest "+p2.getLoanInterest()+" \t"+"Account no "+p2.account.getAccountId()+" \t"+"Balance is "+p2.account.getBalance());
		}
	}
}
