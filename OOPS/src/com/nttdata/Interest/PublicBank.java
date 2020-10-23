package com.nttdata.Interest;

public class PublicBank extends Bank implements RBI {

	private String BankType;
	private double loanInterest;
	Account account;
	public PublicBank(String bankName, int bankCode, String bankType,
			double loanInterest,Account account) {
		super(bankName, bankCode);
		BankType = bankType;
		this.loanInterest = loanInterest;
		this.account=account;
	}
	
	
	public String getBankType() {
		return BankType;
	}


	public void setBankType(String bankType) {
		BankType = bankType;
	}


	public double getLoanInterest() {
		return loanInterest;
	}


	public void setLoanInterest(double loanInterest) {
		this.loanInterest = loanInterest;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public void loanInterestCalculation(RBI rbi) {
		System.out.println("Loan interest for public bank is "+loanInterest);
		double h2 = account.getBalance()*(loanInterest/100);
		System.out.println("Loan interest ammount "+h2);
	}


	
}
