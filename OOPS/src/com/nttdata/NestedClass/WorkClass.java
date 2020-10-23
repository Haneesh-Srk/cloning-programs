package com.nttdata.NestedClass;

public class WorkClass {

	public static void main(String[] args) {
		DebitCard d = new DebitCard(123,"haneesh",1234);
		DebitCard.Account acc = d.new Account(123,"srk",1234);
		boolean b=acc.validateDebitCard(1234,"srk");
		if(b==true)
		{
			System.out.println("Valid Credentials");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}

}
