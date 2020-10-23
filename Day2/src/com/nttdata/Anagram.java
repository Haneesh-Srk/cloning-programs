package com.nttdata;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String a = sc.nextLine();
		System.out.println("Enter the second string");
		String b = sc.nextLine();
		char c1[] = a.toCharArray();
		char c2[] = b.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		boolean bo = Arrays.equals(c1, c2);
		if(bo)
		{
			System.out.println("Strings are anagrams");
		}
		else
		{
			System.out.println("Strings are not anagram");
		}
			
	}

}
