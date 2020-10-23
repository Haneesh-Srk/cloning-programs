package com.nttdat.aCollections.Queue;

import java.util.ArrayDeque;

public class DequeueExample {

	public static void main(String[] args) {
		
		ArrayDeque<Object> dequeue=new ArrayDeque<>();
		dequeue.add("srk");
		dequeue.add("haneesh");
		dequeue.add("khan");
		dequeue.add("raj");
		dequeue.add("rahul");
		
		for (Object string : dequeue) {
			System.out.println(string);
		}
	}

}