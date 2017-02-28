package com.d2d.it.model;

import java.util.Date;

public class Salary extends Income {
	private String employerName;
	private Date salaryDate;
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public Date getSalaryDate() {
		return salaryDate;
	}
	public void setSalaryDate(Date salaryDate) {
		this.salaryDate = salaryDate;
	}
	@Override
	public String toString() {
		return "Salary [employerName=" + employerName + ", salaryDate="
				+ salaryDate + ", getIncomeAmount()=" + getIncomeAmount() + "]";
	}
}
