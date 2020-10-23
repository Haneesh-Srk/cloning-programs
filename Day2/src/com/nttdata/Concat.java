package com.nttdata;

public class Concat {
	public static void main(String[] args)
	{
		String hi = "Hi";
		System.out.println(hi);
		String mom = "mom";
		System.out.println(mom);
		String s = hi+mom;
		System.out.println(s);
		
		
		StringBuffer s1 = new StringBuffer("Hi");
		System.out.println(s1);
		StringBuffer s2 = new StringBuffer("mom");
		System.out.println(s2);
		StringBuffer s3 = s1.append(s2);
		System.out.println(s3);
	}
}
