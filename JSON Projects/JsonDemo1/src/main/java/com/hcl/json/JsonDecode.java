package com.hcl.json;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class JsonDecode {

	public static void main(String[] args) {
		
		String s="{\"name\":\"sonoo\",\"salary\":600000.0,\"age\":27}";  
		JSONObject obj=(JSONObject)JSONValue.parse(s);  
		  
		    String name = (String) obj.get("name");  
		    double salary = (Double) obj.get("salary");  
		    long age = (Long) obj.get("age");  
		    System.out.println(name+" "+salary+" "+age);  
	}
}
