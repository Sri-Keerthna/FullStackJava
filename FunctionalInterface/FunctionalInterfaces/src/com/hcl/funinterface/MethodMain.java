package com.hcl.funinterface;

import java.util.function.Consumer;

public class MethodMain {

	public static void main(String[] args) {
		
		MethodInterface obj1=(a)->{System.out.println(a);};
		obj1.someMethod("HCL");
		
		//using method interface we are accessing the println and changing the values
		MethodInterface obj2= System.out::println;
		obj2.someMethod("Java 8");
		
		//Consumer belongs to util.func so it can access using accept keyword
		//it is having string datatype
		Consumer< String> consumer=System.out::println;
		consumer.accept("Bye");
	}
}
