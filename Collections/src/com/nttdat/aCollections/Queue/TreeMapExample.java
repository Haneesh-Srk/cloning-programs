package com.nttdat.aCollections.Queue;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, Book> treeMap=new TreeMap<>();
		
		treeMap.put(1, new Book(12,"java","James",1000));
		treeMap.put(5, new Book(36,"sql","John",2594));
		treeMap.put(8, new Book(5,"node","Ramesh",1456));
		treeMap.put(3, new Book(77,"angular","Suresh",7896));
		
		for(Entry<Integer, Book> m:treeMap.entrySet())
		{
			System.out.println("Key is :"+m.getKey()+" \t"+"Value is :"+m.getValue());
					}
	}

}
