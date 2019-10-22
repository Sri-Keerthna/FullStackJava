package com.hcl.lambda;

public class WithoutLambdaExp {
//an inner class declared without a class name is known as Anonymous inner class
	public static void main(String[] args) {
		MyInterface myInterface=new MyInterface() {
			
			@Override
			public void sayMessage() {
				// TODO Auto-generated method stub
				System.out.println("Welcome to My Interface");
			}
		};
		myInterface.sayMessage();
	}
}
