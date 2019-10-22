package com.hcl.funinterface;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		Integer ans=calculator.calc((x,y)->x+y, 10, 5);
		System.out.println(ans);
		
		Integer ans1=calculator.calc((x,y)->x-y, 10, 5);
		System.out.println(ans1);
		
		Integer ans2=calculator.calc((x,y)->x*y, 10, 5);
		System.out.println(ans2);
	}
}
