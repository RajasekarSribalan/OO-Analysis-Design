package com.designexamples.searchguitar;

import com.designexamples.searchguitar.enums.Builder;
import com.designexamples.searchguitar.enums.Type;
import com.designexamples.searchguitar.enums.Wood;

/**
 * Guitar Class
 * 
 * This is a POJO class for Guitar
 * 
 */
public class Guitar {

	private String serialNumber, model;
	private Builder builder;
	private Type type;
	private Wood backWood, topWood;
	private double price;

	public Guitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood,double price) {

		this.serialNumber = serialNumber;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backWood = backWood;
		this.topWood = topWood;
		this.price = price;

	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
