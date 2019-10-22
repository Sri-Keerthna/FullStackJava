package com.hcl.funinterface;

public class InstanceMethodReference {

	public void saySomething(){
		
		System.out.println("Hello,This is non-static method");
	
	}
	
	public static void main(String[] args) {
		InstanceInterface obj=()->{System.out.println("Welcome");};

		obj.myInterface();
		InstanceMethodReference mainobj=new InstanceMethodReference();
		//if both are same datatype we can call a main method from interface
		InstanceInterface obj2=mainobj::saySomething;
		obj2.myInterface();
	}
}
