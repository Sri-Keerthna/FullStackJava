package com.hcl.demo;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Internalization_Demo {
public static void main(String[] args) {
	
	//Locale Number Format
	double d=100200.321;
	NumberFormat nf=NumberFormat.getNumberInstance(Locale.ITALY);
	NumberFormat nf1=NumberFormat.getNumberInstance(Locale.CHINA);
	NumberFormat nf2=NumberFormat.getNumberInstance(Locale.US);
	System.out.println("Italy Representation of " +d+ ": " +nf.format(d));
	System.out.println("China Representation of "  +d+ ": " +nf1.format(d));
	System.out.println("US Representation of "  +d+ ": " +nf2.format(d)+"\n");
	
	//DATE AND TIME FORMAT
	DateFormat df=DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
	DateFormat df1=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
	DateFormat df2=DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
	System.out.println("Short Format of date " +df.format(new Date()));
	System.out.println("Long Format of date " +df1.format(new Date()));
	System.out.println("Medium Format of date " +df2.format(new Date())+"\n");
	
	//Locale date format
	DateFormat df3=DateFormat.getDateInstance(DateFormat.LONG,new Locale("de","DE")); //DE-Denmark
	System.out.println("Long Format for Date "+df3.format(new Date()));
	
}
}