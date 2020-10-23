package com.nttdat.aCollections.Queue;

import java.util.HashMap;
import java.util.Map;

public class HashMapSimple {

	public static void main(String[] args) {

		HashMap<Integer, String> hashMap=new HashMap<>();
		
		hashMap.put(1, "bangalore");
		hashMap.put(5, "chennai");
		hashMap.put(8, "kolkata");
		hashMap.put(9, "mumbai");
		hashMap.put(7, "hyderabad");
		
		for(Map.Entry<Integer, String> m:hashMap.entrySet())
		{
			System.out.println("Key is :"+m.getKey()+" \t"+"Value is :"+m.getValue());
					}
	}

}
