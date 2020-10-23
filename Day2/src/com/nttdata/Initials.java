package com.nttdata;

import java.util.Scanner;

public class Initials {
	 public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the name");
		 String s = sc.nextLine();
		 System.out.print(s.charAt(0)+ " ");
		 for(int i=0;i<s.length()-1;i++)
		 {
			 char a = s.charAt(i);
			 if(a==' ')
			 {
				 System.out.print(s.charAt(i+1)+ " ");
			 }
		 }
			 
	 }
}