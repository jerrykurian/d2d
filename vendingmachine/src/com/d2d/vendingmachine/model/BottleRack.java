package com.d2d.vendingmachine.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BottleRack {
	private Map<String, List<Bottle>> drinks = 
			new HashMap<String, List<Bottle>>();
	
	public void addBottles(String name, Bottle bottle, int quantity){
		int i = 0;
		List<Bottle> bottles = new ArrayList<Bottle>();
		while(i<quantity){
			bottles.add(bottle);
		}
		this.drinks.put(name, bottles);
	}
	
	public Bottle getBottle(String name){
		List<Bottle> bottles = this.drinks.get(name);
		return bottles.remove(0);
	}
}
