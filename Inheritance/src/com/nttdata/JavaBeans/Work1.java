package com.nttdata.JavaBeans;

public class Work1 {

	public static void main(String[] args) {
	
		Product product = new Product(123,"phone",9999.9);
		
		Customer customer = new Customer(456,"Srk");
		
		product.printProductDetails(customer);
		customer.printCustomerDetails(product);
		
	}

}
