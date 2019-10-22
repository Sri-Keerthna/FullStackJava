package com.hcl.lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEachLambda {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	
	//for(String var:list){
	//System.out.println(var);
	//}
	list.forEach((var)->System.out.println(var));
}
}
