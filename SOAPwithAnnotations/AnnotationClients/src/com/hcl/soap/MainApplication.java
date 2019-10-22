package com.hcl.soap;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		String res;
		HelloProxy helloProxy=new HelloProxy();
		try {
			res=helloProxy.sayHello("Soundarraj");
			System.out.println("Name is : "+res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
