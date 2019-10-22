package com.sri;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class MainQuery {

	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employee");
		q=s.getNamedQuery("HQL_GET_EMPLOYEE_BY_NAME");
		q.setString("name", "Suganya");
		List<Employee> listEmploy=q.list();
		for (Employee employee : listEmploy) {
			System.out.println(employee);
		}
		
	}
}
