package com.hcl.model;

import org.omg.CORBA.Request;

public class Employee {

	private long empno;
	private String empname;
	private long salary;
	private String band;
	private String dateofjoin;
	
	
	public long getEmpno() {
		return empno;
	}
	public void setEmpno(long empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getDateofjoin() {
		return dateofjoin;
	}
	public void setDateofjoin(String dateofjoin) {
		this.dateofjoin = dateofjoin;
	}
	
//public Employee(long empno, String empname, long salary, String band, String dateofjoin) {
//		super();
//	this.empno = empno;
//	this.empname = empname;
//		this.salary = salary;
//		this.band = band;
//		this.dateofjoin = dateofjoin;
//	}
	
	
}
