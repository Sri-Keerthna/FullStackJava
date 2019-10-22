package com.hcl.soap;

import java.rmi.RemoteException;

import com.jaanu.JananiDemoProxy;
import com.sri.SriProxy;

public class MainApplication {

	public static void main(String[] args) {
		int res=0;
		JananiDemoProxy jananiDemoProxy=new JananiDemoProxy();
		try {
			res=jananiDemoProxy.getInt();
			System.out.println("Janani : "+res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int res1=0;
		SriProxy sriProxy=new SriProxy();
		try {
			res1=sriProxy.getSapCode();
			System.out.println("Priya : "+res1);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int res2=0;
		CalculatorProxy calculatorProxy=new CalculatorProxy();
		try {
			res2=calculatorProxy.add(res,res1);
			System.out.println("Add 2 SAP : "+res2);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
