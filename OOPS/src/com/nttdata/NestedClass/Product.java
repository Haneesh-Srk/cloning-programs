package com.nttdata.NestedClass;

public class Product extends Object implements Cloneable {
	int prodId;
	String prodName;
	double prodCost;
	public Product(int prodId,String prodName,double prodCost)
	{
		super();
		this.prodId=prodId;
		this.prodName=prodName;
		this.prodCost=prodCost;
	}
	public void display()
	{
		System.out.println("Product details are :");
		System.out.println("Product ID is: "+prodId);
		System.out.println("Product name is: "+prodName);
		System.out.println("Product cost is: "+prodCost);
	}
	
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
