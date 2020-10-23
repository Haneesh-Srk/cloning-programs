package com.nttdat.aCollections.Queue;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> queue=new PriorityQueue<>();
		queue.add(15);
		queue.add(16);
		queue.add(24);
		queue.add(06);
		queue.add(70);
		
		for (Integer integer : queue) {
			System.out.println(integer);
		}
		
	}

}
