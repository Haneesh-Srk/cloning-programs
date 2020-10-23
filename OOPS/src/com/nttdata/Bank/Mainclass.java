package com.nttdata.Bank;

import com.nttdata.Exception.User;

public class Mainclass {

	public static void main(String[] args)
	{
		User user = new User();
		try{
			user.transaction(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

