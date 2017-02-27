package com.d2d.vendingmachine.parts.vendora;

import com.d2d.vendingmachine.model.Bottle;
import com.d2d.vendingmachine.parts.BottleDispensor;

public class ABottleDispensor implements BottleDispensor {

	@Override
	public void dispense(Bottle bottle) {
		// TODO Auto-generated method stub
		System.out.println("Dispensed " + bottle);
	}

}
