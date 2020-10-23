package com.nttdata.JavaBeans;

public class Student {

	private int studId;
	private String studName;
	private String studAddress;
	
	public void setStudId(int studId)
	{
		this.studId=studId;
	}
	public int getStudId()
	{
		return studId;
	}
	
	public void setStudName(String studName)
	{
		this.studName=studName;
	}
	public String getStudName()
	{
		return studName;
	}
	
	public void setStudAddress(String studAddress)
	{
		this.studAddress=studAddress;
	}
	public String getStudAddress()
	{
		return studAddress;
	}
	
	public Student(int studId, String studName, String studAddress){
		super();
		this.studId=studId;
		this.studName=studName;
		this.studAddress=studAddress;
	}
	
	public void printStudentDetails(Marks m)
	{
		System.out.println("Student details are");
		System.out.println("Maths marks are "+m.getMaths()+" \t "+"Science marks are "+m.getScience());
	}
}


