package com.nttdata;

public class Customer {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub

		int customerid;
		String customername;
		String customeraddress;
		
		public Customer(int customerid, String customername, String customeraddress)
		{
			this.customerid = customerid;
			this.customername = customername;
			this.customeraddress = customeraddress;
		}
		
		public void displayCustomer()
		{
			System.out.println("Customer id:"+customerid + " " +"Customer name:"+customername +" "+"Customer address:"+customeraddress);
		}
	}

