package com.nttdata.Abstraction;

public class Work1 {

	public static void main(String[] args)
	{
		Memory m=new Memory("8gb");
		Processor p = new Processor(m,"snapdragon");
		Mobile mob = new Mobile("white",p,"nokia");
		mob.startDevice(mob);
		mob.displayMobileDetails();
		mob.stopDevice(mob);
		
		Ram r = new Ram(8);
		MotherBoard mo = new MotherBoard(r, "i5");
		Computer comp = new Computer("Black", mo, 50000, "Dell");
		comp.startDevice(comp);;
		comp.displayComputerDetails();
		comp.stopDevice(comp);
		
		
		
	}
}
