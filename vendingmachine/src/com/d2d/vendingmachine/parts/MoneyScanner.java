package com.d2d.vendingmachine.parts;

public interface MoneyScanner {
	public String scan() throws ScanningFaultException;
}
