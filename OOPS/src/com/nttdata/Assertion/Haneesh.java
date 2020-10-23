package com.nttdata.Assertion;

import java.awt.geom.Area;
import java.util.Scanner;

public class Haneesh {

	public static void main(String[] args)
	{
			System.out.println("Enter the value");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			assert n<= 10 :"its invalid no";
			System.out.println(n);
	}
}
