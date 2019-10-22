package com.hcl.funinterface;

public class Employeemain {

	public static void main(String[] args) {
		EmployInterface obj=Employee::new;
		Employee employee=obj.EmpInterface(22, "HCL");
		System.out.println(employee.getEmpNo());
		System.out.println(employee.getEmpName());
		
		EmpInf1 obj1=Employee::new;
		Employee e2=obj1.InfwithNo(100);
		System.out.println(e2.getEmpNo());
		
		EmpInf2 obj2=Employee::new;
		Employee e3=obj2.InfwithString("Sri");
		System.out.println(e3.getEmpName());
	}
}
