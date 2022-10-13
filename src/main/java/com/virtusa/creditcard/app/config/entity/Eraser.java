package com.virtusa.creditcard.app.config.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ER")
public class Eraser extends Product {

	private String eraserType;
	
	private int weight;

	public String getEraserType() {
		return eraserType;
	}

	public void setEraserType(String eraserType) {
		this.eraserType = eraserType;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Eraser [eraserType=" + eraserType + ", weight=" + weight + "]";
	}

	
}
