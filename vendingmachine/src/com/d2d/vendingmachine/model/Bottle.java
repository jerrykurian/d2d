package com.d2d.vendingmachine.model;

public class Bottle {
	private String label;
	private long price;
	private int capacity;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	@Override
	public String toString() {
		return "Bottle [label=" + label + ", capacity=" + capacity + "]";
	}
}
