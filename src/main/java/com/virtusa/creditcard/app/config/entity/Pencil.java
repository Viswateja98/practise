package com.virtusa.creditcard.app.config.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PC")
public class Pencil extends Product {

	private String penType;
	
	private String manuf;

	public String getPenType() {
		return penType;
	}

	public void setPenType(String penType) {
		this.penType = penType;
	}

	public String getManuf() {
		return manuf;
	}

	public void setManuf(String manuf) {
		this.manuf = manuf;
	}

	@Override
	public String toString() {
		return "Pencil [penType=" + penType + ", manuf=" + manuf + "]";
	}

	
	
	
}
