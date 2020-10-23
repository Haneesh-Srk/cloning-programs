package com.nttdata;

public class task3 {
	public static void main(String[] args)
	{
		int i=8;
		System.out.println("Value of i is " + Integer.toBinaryString(i));
		i>>=2;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(i);
	}

}
