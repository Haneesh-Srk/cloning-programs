package com.nttdat.aCollections.Queue;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<Integer, Book> hashMap=new HashMap<>();
		
		hashMap.put(1, new Book(12,"java","James",1000));
		hashMap.put(5, new Book(36,"sql","John",2594));
		hashMap.put(null, new Book(5,"node","Ramesh",1456));
		hashMap.put(3, new Book(77,"angular","Suresh",7896));
		
		for(Entry<Integer, Book> m:hashMap.entrySet())
		{
			System.out.println("Key is :"+m.getKey()+" \t"+"Value is :"+m.getValue());
					}
	}

}
