package com.hcl.lambda;

public class WithMaxTwoNumbers {
public static void main(String[] args) {
	MyMaxInterface myInterface=(int a,int b)->{int max=a>b?a:b;return max;};
	//we can also have ( a, b)->{max=a>b?a:b;return max;};
	//bt we cant write like ths
	//it will show compile time error ( int a, b)->{max=a>b?a:b;return max;};
	int result=myInterface.MaxTwoNumbers(20, 40);
	System.out.println(result);
}

}
