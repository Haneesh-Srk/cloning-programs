package com.nttdata.Interest;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		System.out.println("Enter details of first Bank");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter bank Name ");
		String s1 = scan.nextLine();
		System.out.println("Enter bank Code ");
		int s2 = scan.nextInt();
		System.out.println("Enter bank Type ");
		String s3 = scan.next();
		System.out.println("Enter Loan interest ");
		double s4 = scan.nextDouble();
		System.out.println("Enter account number ");
		int s5 = scan.nextInt();
		System.out.println("Enter bank balance ");
		double s6 = scan.nextDouble();
		
		PrivateBank h1 = new PrivateBank(s1,s2,s3,s4, new Account(s5,s6));
		h1.displayBankDetails(h1);
		h1.loanInterestCalculation(h1);
		
		System.out.println();
		System.out.println("Enter details of second Bank");
		Scanner scanr = new Scanner(System.in);
		System.out.println("Enter bank Name ");
		String a1 = scanr.nextLine();
		System.out.println("Enter bank Code ");
		int a2 = scanr.nextInt();
		System.out.println("Enter bank Type ");
		String a3 = scanr.next();
		System.out.println("Enter Loan interest ");
		double a4 = scanr.nextDouble();
		System.out.println("Enter account number ");
		int a5 = scanr.nextInt();
		System.out.println("Enter bank balance ");
		double a6 = scanr.nextDouble();
		PublicBank h2 = new PublicBank(a1,a2,a3,a4, new Account(a5,a6));
		h2.displayBankDetails(h2);
		h2.loanInterestCalculation(h2);
	}	
}