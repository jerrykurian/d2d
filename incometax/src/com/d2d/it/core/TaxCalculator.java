package com.d2d.it.core;

import java.util.List;

import com.d2d.it.model.Cess;
import com.d2d.it.model.Constraint;
import com.d2d.it.model.Income;
import com.d2d.it.model.Person;

public interface TaxCalculator {
	
	public long calculateTax(List<Income> incomes,
			List<Constraint> constraints,
			List<Cess> cess,
			Person person);
}
