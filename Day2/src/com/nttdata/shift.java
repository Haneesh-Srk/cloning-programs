package com.nttdata;

public class shift {
	public static void main(String[] args)
	{
		int h=5;
		System.out.println("Value of h " +Integer.toBinaryString(h));
		int s=h<<1;
		System.out.println("Value of s " + Integer.toBinaryString(s));
		
		int a=5;
		System.out.println("Value of a " +Integer.toBinaryString(a));
		int b=a<<2;
		System.out.println("Value of b " + Integer.toBinaryString(b));
		
		int c=5;
		System.out.println("Value of c " +Integer.toBinaryString(c));
		int d=c>>1;
		System.out.println("Value of d " + Integer.toBinaryString(d));
		
		int p=5;
		System.out.println("Value of p " +Integer.toBinaryString(p));
		int q=p>>2;
		System.out.println("Value of q " + Integer.toBinaryString(q));
	}

}
