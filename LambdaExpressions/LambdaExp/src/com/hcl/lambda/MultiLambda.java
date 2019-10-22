package com.hcl.lambda;

public class MultiLambda {

	public static void main(String[] args) {
	
		MultiInterface obj=(name)->(name+"World");
		
		//Logic of sayHello
		System.out.println(obj.sayHello("Hello"));
		
		//Accessing static method
		System.out.println(MultiInterface.add(2, 20));
		
		//Accessing default method
		System.out.println(obj.defaultMethod(10));
		
		//another interface object
		MultiInterface obj2=(name)->(name+"World");
		
		//Accessing the equals method
		System.out.println(obj.equals(obj2)); 
		//it compares 2 obj not 2 values so it alwaz return false
}
}
