package com.nttdata.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<product> list = new ArrayList<>();
		list.add(new product(11,"phone",20000));
		list.add(new product(23,"charger",2000));
		list.add(new product(34,"laptop",4589));
		list.add(new product(43,"computer",20000));
		list.add(new product(56,"fan",3000));
		
		List<Double> listD = new ArrayList<>();
		Set<Double> d=list.stream().filter(p->p.price <10000).map(p->p.price).collect(Collectors.toSet());
				
		System.out.println(d);
	}

	
}
