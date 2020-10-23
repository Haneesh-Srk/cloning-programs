package com.nttdat.aCollections.Queue;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Book> hashMap=new LinkedHashMap<>();
		
		hashMap.put(1, new Book(12,"java","James",1000));
		hashMap.put(null, new Book(36,"sql","John",2594));
		hashMap.put(8, new Book(5,"node","Ramesh",1456));
		hashMap.put(3, new Book(77,"angular","Suresh",7896));
		
		for(Entry<Integer, Book> m:hashMap.entrySet())
		{
			System.out.println("Key is :"+m.getKey()+" \t"+"Value is :"+m.getValue());
					}
	}

}
