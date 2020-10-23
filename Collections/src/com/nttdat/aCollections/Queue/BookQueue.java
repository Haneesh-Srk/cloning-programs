package com.nttdat.aCollections.Queue;

import java.util.PriorityQueue;

public class BookQueue {

	public static void main(String[] args) {
		
		PriorityQueue<Book> queue=new PriorityQueue<>();
		
		queue.add(new Book(12,"java","James",1000));
		queue.add(new Book(36,"sql","John",2594));
		queue.add(new Book(5,"node","Ramesh",1456));
		queue.add(new Book(77,"angular","Suresh",7896));
		
		for (Book book : queue) {
			System.out.println(book);
		}
	}

}
