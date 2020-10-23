package com.nttdata.NestedClass;

public class DebitCard {

	private int cardNumber;
	private String holderName;
	private int cvv;
	
	public DebitCard(int cardNumber,String holderName,int cvv)
	{
		super();
		this.cardNumber=cardNumber;
		this.holderName=holderName;
		this.cvv=cvv;
	}
	
	class Account 
	{
		private int accountNo;
		private String userName;
		private int pin;
		
		public Account(int accountNo,String userName,int pin)
		{
			super();
			this.accountNo=accountNo;
			this.userName=userName;
			this.pin=pin;
		}
		
		boolean validateDebitCard(int pin,String userName)
		{
			if(this.pin==pin&&this.userName==userName)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}
}
