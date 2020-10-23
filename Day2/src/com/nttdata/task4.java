package com.nttdata;

public class task4 {

	public static void main(String[] args)
		{
			int i=17;
			System.out.println("Value of i is " + Integer.toBinaryString(i));
			i>>=1;
			System.out.println(Integer.toBinaryString(i));
			System.out.println(i);
		}
}