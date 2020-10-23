package com.nttdata.assignment;

public class Laptop extends ElectronicDevice{

	MotherBoard motherBoard;
	String lmodel;
	
	public Laptop(int cost,String brand,String color,MotherBoard motherBoard, String lmodel){
		super(cost, brand, color);
		this.motherBoard=motherBoard;
		this.lmodel=lmodel;
				}
	
	void display2()
	{
		System.out.println("The computer details are");
		System.out.println("The cost is:"+cost);
		System.out.println("The brand is:"+brand);
		System.out.println("The color is:"+color);
		System.out.println("The ram is:"+motherBoard.ramsize);
		System.out.println("The motherboard model is:"+lmodel);
	}
}