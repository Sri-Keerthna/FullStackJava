package com.hcl.funinterface;

import java.util.function.BiFunction;

public class Calculator {

	//Represents a func that takes 2 args of types T,R and returns Result R.
	
	public Integer calc(BiFunction<Integer, Integer, Integer> bi,Integer num1,	Integer num2) {
		return bi.apply(num1, num2);
	}
}
