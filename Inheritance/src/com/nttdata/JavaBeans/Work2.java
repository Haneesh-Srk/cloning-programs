package com.nttdata.JavaBeans;

public class Work2 {

	public static void main(String[] args) {
		
		Student student = new Student(123,"Srk","vijayawada");
		Marks marks = new Marks(80,90);
		StudentDao studentDao=new StudentDaoImp();
		Student s=studentDao.createStudent(student);
		System.out.println("Student details are");
		System.out.println("Student id is "+s.getStudId());
		System.out.println("Student name is "+s.getStudName());
		System.out.println("Student Address is "+s.getStudAddress());
		
		MarksDao marksDao=new MarksDaoImp();
		Marks m=marksDao.createMarks(marks);
		System.out.println("Marks details are ");
		System.out.println("Maths marks are "+m.getMaths());
		System.out.println("Science marks are "+m.getScience());
	}
}
