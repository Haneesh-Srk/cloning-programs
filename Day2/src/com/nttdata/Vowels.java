package com.nttdata;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String s = sc.nextLine();
		int count = 0;
		for(int i=0; i<+s.length()-1;i++)
		{
			char c= s.charAt(i);
			if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u')||(c=='A')||(c=='E')||(c=='I')||(c=='O')||(c=='U'))
					{
				count++;
					}
		}
		System.out.println("No. of vowels is " +count);
	}

}
