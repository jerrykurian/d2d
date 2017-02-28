package com.
d2d.it.core.impl;

import java.util.List;

import com.d2d.it.core.TaxCalculator;
import com.d2d.it.model.Cess;
import com.d2d.it.model.Constraint;
import com.d2d.it.model.Income;
import com.d2d.it.model.Person;

public class TaxCalculatorImpl implements TaxCalculator {

	@Override
	public long calculateTax(List<Income> incomes,
			List<Constraint> constraints, List<Cess> cess, Person person) {
		// TODO Auto-generated method stub
		long sumOfAllIncomes = addIncomes(incomes);
		long taxAmount = applyConstraints(sumOfAllIncomes,
				constraints, person);
		long taxAmountWithCess = applyCess(taxAmount, cess, person);
		return taxAmountWithCess;
	}

	private long applyCess(long taxAmount, List<Cess> cesses,
			Person person) {
		// TODO Auto-generated method stub
		long totalTax = taxAmount;
		for(Cess cess:cesses){
			totalTax += cess.apply(taxAmount, person);
		}
		return totalTax;
	}

	private long applyConstraints(long sumOfAllIncomes,
			List<Constraint> constraints,
			Person person) {
		// TODO Auto-generated method stub
		long totalTax = 0;
		for(Constraint constraint:constraints){
			totalTax+=constraint.apply(sumOfAllIncomes, person);
		}
		return totalTax;
	}

	private long addIncomes(List<Income> incomes) {
		// TODO Auto-generated method stub
		long sum = 0;
		for(Income income:incomes){
			sum+=income.getIncomeAmount();
		}
		return sum;
	}

}
