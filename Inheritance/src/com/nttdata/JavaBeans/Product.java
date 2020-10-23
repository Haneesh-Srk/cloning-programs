package com.nttdata.JavaBeans;

public class Product {

	private int productId;
	private String productName;
	private double productCost;
	
	public void setProductId(int productId)
	{
		this.productId=productId;
	}
	public int getProductId()
	{
		return productId;
	}
	
	public void setProductName(String productName)
	{
		this.productName=productName;
	}
	public String getPProductName()
	{
		return productName;
	}
	
	public void setProductCost(double productCost)
	{
		this.productCost=productCost;
	}
	public double getPProductCost()
	{
		return productCost;
	}
	
	public Product(int productId, String productName, double productCost){
		super();
		this.productId=productId;
		this.productName=productName;
		this.productCost=productCost;
	}
	
	public void printProductDetails(Customer c)
	{
		System.out.println("Product Details");
		System.out.println("Customer name----"+c.getCustName());
	}
}
