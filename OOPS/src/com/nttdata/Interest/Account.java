package com.nttdata.Interest;

public class Account {

	private int accountId;
	private double balance;
	public Account(int accountId, double balance) {
		super();
		this.accountId = accountId;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
