package com.nttdata.assignment;

public class Computer extends ElectronicDevice{

	MotherBoard motherBoard;
	String mbmodel;
	
	public Computer(int cost,String brand,String color,MotherBoard motherBoard, String mbmodel){
		super(cost, brand, color);
		this.motherBoard=motherBoard;
		this.mbmodel=mbmodel;
				}
	
	void display1()
	{
		System.out.println("The computer details are");
		System.out.println("The cost is:"+cost);
		System.out.println("The brand is:"+brand);
		System.out.println("The color is:"+color);
		System.out.println("The ram is:"+motherBoard.ramsize);
		System.out.println("The motherboard model is:"+mbmodel);
	}
}
