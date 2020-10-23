package com.nttdata.JavaBeans;

public class Marks {

	private int maths;
	private int science;
		
	public void setMaths(int maths)
	{
		this.maths=maths;
	}
	public int getMaths()
	{
		return maths;
	}
	
	public void setScience(int science)
	{
		this.science=science;
	}
	public int getScience()
	{
		return science;
	}
	
		public Marks(int maths, int science){
		super();
		this.maths=maths;
		this.science=science;
	}
	
	public void printMarksDetails(Student s)
	{
		System.out.println("Student Details");
		System.out.println("Student name----"+s.getStudName());
	}
}
