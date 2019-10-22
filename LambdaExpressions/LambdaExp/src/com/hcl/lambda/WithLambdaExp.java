package com.hcl.lambda;

public class WithLambdaExp {
public static void main(String[] args) {
	MyFunctionalInterface myfuncInterface=()->{System.out.println("Welcome Lambda");};
	myfuncInterface.sayMessage();
}
}
