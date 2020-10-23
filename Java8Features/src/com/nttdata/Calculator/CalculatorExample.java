package com.nttdata.Calculator;

public class CalculatorExample {

	public static void main(String[] args)
	{
		Addition p = (a1,b1)->{System.out.println("Addition of numbers "+(a1+b1));};
		Subtraction q = (a,b)->{System.out.println("Subtraction of numbers "+(a-b));};
		Multiplication r = (a,b)->{System.out.println("Multiplication of numbers "+(a*b));};
		Division s = (a,b)->{System.out.println("Division of numbers "+(a/b));};
		p.add1(25, 45);
		q.sub(90,30);
		r.mul(9,5);
		s.div(100, 10);
	}
}
