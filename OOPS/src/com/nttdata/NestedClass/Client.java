package com.nttdata.NestedClass;

public class Client {

	public static void main(String[] args) {
		
		Product p = new Product(456,"radio",9000);
		p.display();
		try
		{
			Product p2 = (Product)p.clone();
			p2.display();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
	}

}
