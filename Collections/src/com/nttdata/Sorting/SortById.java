package com.nttdata.Sorting;

import java.util.Comparator;

public class SortById implements Comparator<Employee>{

	//private int empId;

	@Override
	public int compare(Employee o1,Employee o2) {
		if(o1.getEmpId()<o2.getEmpId())
		{
			return 1;
		}
		else if(o1.getEmpId()>o2.getEmpId())
		{
			return -1;
		}
		return 0;
	}

}
