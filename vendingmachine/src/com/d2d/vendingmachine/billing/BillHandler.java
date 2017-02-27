package com.d2d.vendingmachine.billing;

import java.util.List;

import com.d2d.vendingmachine.model.Money;

public interface BillHandler {
	public List<Money> handleCashPayment(long expectedMoney, 
			List<Money> paidMoney);
	public long handlePayment(long expectedMoney, long moneyPaid);
}
