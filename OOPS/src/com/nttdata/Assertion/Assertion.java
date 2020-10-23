package com.nttdata.Assertion;

import java.util.Scanner;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the value");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		assert n<= 10 :"its invalid no";
		System.out.println(n);
	}

}
