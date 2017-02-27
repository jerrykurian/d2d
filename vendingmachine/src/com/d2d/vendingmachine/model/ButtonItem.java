package com.d2d.vendingmachine.model;

public class ButtonItem {
	private long itemId;
	private String name;
	private int price;
	private boolean available;
	
	public ButtonItem(long itemId, String name, int price) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.available = true;
	}
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
		return "ButtonItem [itemId=" + itemId + ", name=" + name + ", price="
				+ price + ", available=" + available + "]";
	}
	
}
