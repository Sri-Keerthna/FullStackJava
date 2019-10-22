package com.hcl.lambda;

public class MyImplements implements MyInterfaceImpl{
public static void main(String[] args) {
	new MyImplements().printHello();
	
	MyInterfaceImpl.printHi(); //it is static so interface name shd be given
}
}
