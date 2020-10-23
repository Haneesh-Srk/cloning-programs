package com.nttdata.Exception;

public class Work {

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
