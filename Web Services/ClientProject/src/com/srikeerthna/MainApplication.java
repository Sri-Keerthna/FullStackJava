package com.srikeerthna;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		String res;
		SriKeerthnaProxy sriKeerthnaProxy=new SriKeerthnaProxy();
		try {
			res=sriKeerthnaProxy.getName();
			System.out.println("My Details : "+res);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
