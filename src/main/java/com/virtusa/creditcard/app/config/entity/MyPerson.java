package com.virtusa.creditcard.app.config.entity;

import javax.persistence.Entity;

@Entity
public class MyPerson extends Person {
	private String adhaarNum;
	
	private String Country;

	public String getAdhaarNum() {
		return adhaarNum;
	}

	public void setAdhaarNum(String adhaarNum) {
		this.adhaarNum = adhaarNum;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
}
