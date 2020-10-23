package com.nttdata.Bank;

public class Users {

	private String userName;
	private String address;
	private Account account;
	public Users(String userName, String address, Account account) {
		super();
		this.userName = userName;
		this.address = address;
		this.account = account;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public void displayUserDetails()
	{
		System.out.println("User details are");
		System.out.println("User name is "+userName+" \t"+"User address is"+address);
		System.out.println("Account id is"+account.getAccountId()+" \t"+"Balance is"+account.getBalance());
	}
}