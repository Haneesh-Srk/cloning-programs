package com.nttdata.Bank;

import com.nttdata.Exception.Account;
import com.nttdata.Exception.Bank;
import com.nttdata.Exception.InvalidTransferAmount;

public class User {

	public void transaction(double transfer) throws Exception
	{
		
		Account acc1 = new Account(123,"srk",12000);
		Bank b1 = new Bank("sbi",456,acc1);
		Account acc2 = new Account(456,"haneesh",15000);
		Bank b2 = new Bank("citi",852,acc2);
		b1.displayBankDetails();
		b2.displayBankDetails();
		
		if(b1.account.getBalance()<transfer)
		{
			throw new InvalidTransferAmount("Insufficient fund");
		}
		else
		{
			b1.account.setBalance(b1.account.getBalance()-transfer);
			b2.account.setBalance(b2.account.getBalance()+transfer);
		}
		System.out.println("Balance after transaction");
		b1.displayBankDetails();
		b2.displayBankDetails();
	}

}

