package com.virtusa.creditcard.app.config.entity;

import javax.persistence.Entity;

@Entity
public class YourPerson extends Person {
	
	private String ssn;

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

}
