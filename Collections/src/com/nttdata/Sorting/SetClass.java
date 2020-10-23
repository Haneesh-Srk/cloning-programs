package com.nttdata.Sorting;

import java.util.HashSet;

public class SetClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set=new HashSet<>();
		set.add("hello");
		set.add("apple");
		set.add("null");
		set.add("zero");
		set.add("japan");
		set.add("tree");
		
		for (String string : set) {
		System.out.println(string);	
		}
	}

}
