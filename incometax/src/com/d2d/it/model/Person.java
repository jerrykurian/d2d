package com.d2d.it.model;

import java.util.Date;

public class Person {
	private String firstName;
	private String lastName;
	private Date dob;
	private Gender gender;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName
				+ ", dob=" + dob + ", gender=" + gender + "]";
	}
}
