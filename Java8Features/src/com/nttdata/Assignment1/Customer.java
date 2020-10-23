package com.nttdata.Assignment1;

public class Customer {

	int custId;
	String custName;
	String custPassword;
	double price;
	String custCity;
	public Customer(int custId, String custName, String custPassword, double price, String custCity) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custPassword = custPassword;
		this.price = price;
		this.custCity = custCity;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", custPassword=" + custPassword + ", price="
				+ price + ", custCity=" + custCity + "]";
	}
	
	
}
