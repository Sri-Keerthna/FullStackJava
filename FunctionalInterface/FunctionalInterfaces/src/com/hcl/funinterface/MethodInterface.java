package com.hcl.funinterface;

@FunctionalInterface
public interface MethodInterface {

	//Its datatype is String so it can be access by any util.func with string datatype
	public void someMethod(String name);
}
