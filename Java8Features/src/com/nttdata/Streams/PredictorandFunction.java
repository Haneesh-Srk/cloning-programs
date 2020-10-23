package com.nttdata.Streams;

import java.util.function.Predicate;
import java.util.function.*;

public class PredictorandFunction {

	public static void main(String[] args) {
		
		//Prediction
		Predicate<Integer> p = s->(s>30);
		System.out.println("predict "+p.test(50));
		
		Predicate<String> p1 = s1->(s1.length()>4);
		System.out.println("predict "+p1.test("ram"));
		
		//Function
		Function<String, Integer> f= sf->sf.length();
		System.out.println(f.apply("hello world"));
	}
}
