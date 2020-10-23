package com.nttdat.aCollections.Queue;

public class Book implements Comparable<Book>{

	int bookId;
	String name,author;
	double price;
	public Book(int bookId, String name, String author, double price) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	@Override
	public int compareTo(Book o) {
		if(o.bookId<this.bookId)
		{
			return 1;
		}
		else if(o.bookId>o.bookId)
		{
			return -1;
		}
		else
		return 0;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", name=" + name + ", author="
				+ author + ", price=" + price + "]";
	}
	
	
	
}
