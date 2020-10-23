package com.nttdata.JavaBeans;

public class Customer {

	private int custId;
	private String custName;
	
	public void setCustId(int custId)
	{
		this.custId=custId;
	}
	public int getcustId()
	{
		return custId;
	}
	
	public void setCustName(String custName)
	{
		this.custName=custName;
	}
	public String getCustName()
	{
		return custName;
	}
	
	
	public Customer(int custId,String custName)
	{
		super();
		this.custId=custId;
		this.custName=custName;
	}
	
	void printCustomerDetails(Product p)
	{
		System.out.println("Customer details:");
		System.out.println("Product id :"+p.getProductId()+" \t "+"Product name: "+p.getPProductName()+" \t "+"Product cost: "+p.getPProductCost());
		
	}
}
