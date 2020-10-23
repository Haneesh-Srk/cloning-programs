package com.nttdata.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentClient {

	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<>();
		list.add(new Student(111,"srk",70));
		list.add(new Student(112,"haneesh",80));
		list.add(new Student(113,"raj",75));
		list.add(new Student(114,"king",64));
		list.add(new Student(115,"khan",99));
		System.out.println("Forward direction");
		ListIterator<Student> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("Backward direction");
		System.out.println("--------------------------------");
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
