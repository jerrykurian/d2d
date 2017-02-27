package com.d2d.vendingmachine.parts.vendora;

import java.io.IOException;

import com.d2d.vendingmachine.parts.MoneyScanner;
import com.d2d.vendingmachine.parts.ScanningFaultException;

public class AMoneyScanner implements MoneyScanner {

	@Override
	public String scan() throws ScanningFaultException {
		// TODO Auto-generated method stub
		try {
			int input = System.in.read();
			return new Integer(input).toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new ScanningFaultException();
		}
	}
}
