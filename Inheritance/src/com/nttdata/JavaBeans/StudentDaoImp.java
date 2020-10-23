package com.nttdata.JavaBeans;

public class StudentDaoImp implements StudentDao {

	public Student createStudent(Student student)
	{
		String s=student.getStudName();
		int a=student.getStudId();
		String s2=student.getStudAddress();
		student.setStudId(a);
		student.setStudName(s);
		student.setStudAddress(s2);
		return student;
	}
}
