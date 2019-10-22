package com.sri;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employee");
		q.setFirstResult(2);
		q.setMaxResults(5);
	List<Employee> listEmploy=q.list();
//		
//			for (Employee e : listEmploy) {
//		
//			System.out.println("Employ No........" +e.getEmpno());
//			System.out.println("Name of Employ..." +e.getName());
//			System.out.println("Department......." +e.getDept());
//			System.out.println("Designation......" +e.getDesig());
//			System.out.println("Basic............" +e.getBasic());
//			System.out.println(" ");
//		}
		
		//This is for setting conditions for basic
			Criteria c=s.createCriteria(Employee.class);
			c.add(Restrictions.gt("basic", 10000));
			List<Employee> list=c.list();
//			for (Employee e : list) {
//				
//				System.out.println("Employ No........" +e.getEmpno());
//				System.out.println("Name of Employ..." +e.getName());
//				System.out.println("Department......." +e.getDept());
//				System.out.println("Designation......" +e.getDesig());
//				System.out.println("Basic............" +e.getBasic());
//				System.out.println(" ");
//			}
			
			//This is for arranging any one name in ascending order
			Criteria a=s.createCriteria(Employee.class);
			a.addOrder(Order.asc("name"));
			List<Employee> lstemp=a.list();
//			for (Employee e : lstemp) {
//			
//			System.out.println("Employ No........" +e.getEmpno());
//				System.out.println("Name of Employ..." +e.getName());
//				System.out.println("Department......." +e.getDept());
//				System.out.println("Designation......" +e.getDesig());
//				System.out.println("Basic............" +e.getBasic());
//				System.out.println(" ");
//			}
			
			Criteria b=s.createCriteria(Employee.class);
			b.setProjection(Projections.property("name"));
			List<String> employList=b.list();
			
			for (String employ : employList) {
				System.out.println("Name :"+employ);
			}
			sf.close();
	}
}
