package com.nttdata.Assignment1;

import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.Map.Entry;

import java.util.HashMap;
import java.util.List;

public class CustomerMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Customer> hashMap=new HashMap<>();
		
		String s1="Haneesh123";
		Encoder encoderMime=Base64.getMimeEncoder();
		String mimeEncoded1=encoderMime.encodeToString(s1.getBytes());
		hashMap.put(1, new Customer(11,"Haneesh",mimeEncoded1,2000,"Mumbai"));
		String s2="Srk123";
		String mimeEncoded2=encoderMime.encodeToString(s2.getBytes());
		hashMap.put(2, new Customer(45,"Srk",mimeEncoded2,6000,"Banglore"));
		String s3="Kakashi123";
		String mimeEncoded3=encoderMime.encodeToString(s3.getBytes());
		hashMap.put(3, new Customer(32,"Kakashi",mimeEncoded3,100000,"Hyderabad"));
		String s4="Sasuke123";
		String mimeEncoded4=encoderMime.encodeToString(s4.getBytes());
		hashMap.put(4, new Customer(78,"Sasuke",mimeEncoded4,5688,"Mumbai"));
		String s5="Shyam123";
		String mimeEncoded5=encoderMime.encodeToString(s5.getBytes());
		hashMap.put(5, new Customer(55,"Shyam",mimeEncoded5,96874,"Banglore"));
		String s6="Naruto123";
		String mimeEncoded6=encoderMime.encodeToString(s6.getBytes());
		hashMap.put(6, new Customer(89,"Naruto",mimeEncoded6,4589,"Vijayawada"));
		String s7="Itachi123";
		String mimeEncoded7=encoderMime.encodeToString(s7.getBytes());
		hashMap.put(7, new Customer(45,"Itachi",mimeEncoded7,12355,"Hyderabad"));
		String s8="Raahul";
		String mimeEncoded8=encoderMime.encodeToString(s8.getBytes());
		hashMap.put(8, new Customer(98,"Rahul",mimeEncoded8,9721,"Vijayawada"));
		String s9="Nagato";
		String mimeEncoded9=encoderMime.encodeToString(s9.getBytes());
		hashMap.put(9, new Customer(12,"Nagato",mimeEncoded9,3458,"Banglore"));
		String s10="Tom123";
		String mimeEncoded10=encoderMime.encodeToString(s10.getBytes());
		hashMap.put(10, new Customer(97,"Tom",mimeEncoded10,6972,"Mumbai"));
		
		List<Integer> key = new ArrayList<>(hashMap.keySet());
		List<Customer> value = new ArrayList<>(hashMap.values());
		
		
		
		for(Entry<Integer, Customer> m:hashMap.entrySet())
		{
			System.out.println("Key is :"+m.getKey()+" \t"+"Value is :"+m.getValue());
					}
		
		//city and return count
		long c = value.stream().filter(s->s.custCity.equals("Vijayawada")).count();
		System.out.println("Number of customers in city "+c);
		
		//Max and Min values
		System.out.println("Maximun total price of customer");
		Customer max = value.stream().max((h1,h2)->h1.price<h2.price?-1:1).get();
		System.out.println(max);
		System.out.println("Minimum total price of customer");
		Customer min = value.stream().min((h1,h2)->h1.price<h2.price?-1:1).get();
		System.out.println(min);
	}

}
