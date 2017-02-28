package com.d2d.it.model;

import java.util.Date;

public class Rent extends Income {
	private String tenantName;
	private Date rentDate;
	public String getTenantName() {
		return tenantName;
	}
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}
	public Date getRentDate() {
		return rentDate;
	}
	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}
	@Override
	public String toString() {
		return "Rent [tenantName=" + tenantName + ", rentDate=" + rentDate
				+ ", getIncomeAmount()=" + getIncomeAmount() + "]";
	}
}
