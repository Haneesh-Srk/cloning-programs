package com.nttdata.Exception;

public class Account {

	private int accountId;
	private String userName;
	private double balance;
	public Account(int accountId, String userName, double balance) {
		super();
		this.accountId = accountId;
		this.userName = userName;
		this.balance = balance;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}
