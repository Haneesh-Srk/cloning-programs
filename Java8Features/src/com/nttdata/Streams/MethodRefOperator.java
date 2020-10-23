package com.nttdata.Streams;

public class MethodRefOperator {

	static void open()
	{
		System.out.println("static method open");
	}
	public static void main(String[] args) {
		Sample s = MethodRefOperator::open;
		s.display();
	}
}
