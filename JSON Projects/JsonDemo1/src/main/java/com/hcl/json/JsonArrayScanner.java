package com.hcl.json;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonArrayScanner {

	public static void main(String[] args) {
		JSONObject obj=new JSONObject(); 
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<1;i++)
		  {
		  JSONArray arr = new JSONArray();  
		  System.out.println("enter name :");   
		  arr.add(sc.nextLine());   
		  System.out.println("enter salary :");   
		  arr.add(sc.nextLine());
		  System.out.println("enter age :");   
		  arr.add(sc.nextLine());
		  obj.put(i,arr);
		  }
		  
	System.out.println(obj);
	}
}
