package com.hcl.soap;

import java.rmi.RemoteException;

public class MainApplication {

	public static void main(String[] args) {
		int result=0;
		CalculatorProxy calculatorProxy=new CalculatorProxy();
		try {
			result=calculatorProxy.mul(2, 4);
			System.out.println("Multiplication of 2 Nos :"+result);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
