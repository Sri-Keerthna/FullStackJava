package com.hcl.json;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonObject {

	public static void main(String[] args) {
		 
		  JSONObject obj=new JSONObject(); 
		  for(int i=0;i<3;i++)
		  {
		  JSONArray arr1 = new JSONArray();  
		  arr1.add("Employee" +i);    
		  arr1.add(1000*i);    
		  arr1.add(25+i);   
		  obj.put(i,arr1);  
	}
		  System.out.println(obj);
	}
}
