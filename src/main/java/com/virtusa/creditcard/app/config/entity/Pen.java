package com.virtusa.creditcard.app.config.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("PN")
public class Pen extends Product {

	private String inkColor;
	
	private Boolean isGel;

	public String getInkColor() {
		return inkColor;
	}

	public void setInkColor(String inkColor) {
		this.inkColor = inkColor;
	}

	public Boolean getIsGel() {
		return isGel;
	}

	public void setIsGel(Boolean isGel) {
		this.isGel = isGel;
	}

	@Override
	public String toString() {
		return "Pen [inkColor=" + inkColor + ", isGel=" + isGel + "]";
	}
	
	
}
