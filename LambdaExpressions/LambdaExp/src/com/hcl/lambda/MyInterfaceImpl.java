package com.hcl.lambda;

public interface MyInterfaceImpl {
default void printHello(){
	System.out.println("Hello Default");
}

static void printHi(){
	System.out.println("Hi static");
}
}
