package com.nttdata.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

import com.nttdata.Sorting.Employee;

public class Work {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(111,"srk","vijayawada"));
		list.add(new Employee(112,"haneesh","hyderabad"));
		list.add(new Employee(113,"khan","mumbai"));
		list.add(new Employee(114,"king","kolkata"));
		list.add(new Employee(115,"ram","banglore"));
		
		System.out.println("Sorting by ID");
		//Collections.sort(list);
		Collections.sort(list, new SortById());
		ListIterator<Employee> itr=list.listIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("Sorting by name");
		Collections.sort(list, new SortByName());
		ListIterator<Employee> itr2=list.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
	}

}
