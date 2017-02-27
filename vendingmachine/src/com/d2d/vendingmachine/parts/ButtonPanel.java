package com.d2d.vendingmachine.parts;

import java.util.List;

import com.d2d.vendingmachine.model.ButtonItem;

public interface ButtonPanel {
	public List<ButtonItem> layoutPanel();
	public void hideButton(long itemId);
}
