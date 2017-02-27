package com.d2d.vendingmachine.parts.vendora;

import java.util.ArrayList;
import java.util.List;

import com.d2d.vendingmachine.model.ButtonItem;
import com.d2d.vendingmachine.parts.ButtonPanel;

public class AButtonPanel implements ButtonPanel {
	
	private List<ButtonItem> labelItems = new ArrayList<ButtonItem>();
	
	public AButtonPanel() {
		// TODO Auto-generated constructor stub
		labelItems.add(new ButtonItem(0,"Pepsi",10));
		labelItems.add(new ButtonItem(1,"Mirinda",15));
		labelItems.add(new ButtonItem(2,"Water",20));
		labelItems.add(new ButtonItem(3,"Limca",10));
	}
	
	@Override
	public List<ButtonItem> layoutPanel() {
		// TODO Auto-generated method stub
		return labelItems;
	}

	@Override
	public void hideButton(long itemId) {
		// TODO Auto-generated method stub
		this.labelItems.get(new Long(itemId).intValue()).
			setAvailable(false);;
	}

}
