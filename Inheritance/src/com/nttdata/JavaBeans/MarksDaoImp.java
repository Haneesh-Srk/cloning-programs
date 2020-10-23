package com.nttdata.JavaBeans;

public class MarksDaoImp implements MarksDao {

	public Marks createMarks(Marks marks)
	{
		int h1=marks.getMaths();
		int h2=marks.getScience();
		marks.setMaths(h1);
		marks.setScience(h2);
		return marks;
	}
}
