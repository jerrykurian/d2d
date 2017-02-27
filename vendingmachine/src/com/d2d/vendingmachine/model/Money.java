package com.d2d.vendingmachine.model;

public class Money {
	private int denomination;
	private String currency = "Rs";
	public int getDenomination() {
		return denomination;
	}
	public void setDenomination(int denomination) {
		this.denomination = denomination;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
