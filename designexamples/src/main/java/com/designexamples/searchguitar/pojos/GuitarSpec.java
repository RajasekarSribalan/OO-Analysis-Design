package com.designexamples.searchguitar.pojos;

/**
 * Guitar Spec
 * 
 * @author Rajasekar
 *
 */
public class GuitarSpec {

	private String model;
	private Builder builder;
	private Type type;
	private Wood topWood;
	private Wood backWood;

	public GuitarSpec(String model, Builder builder, Type type, Wood topWood, Wood backWood) {
		this.model = model;
		this.builder = builder;
		this.type = type;
		this.topWood = topWood;
		this.backWood = backWood;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Builder getBuilder() {
		return builder;
	}

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Wood getTopWood() {
		return topWood;
	}

	public void setTopWood(Wood topWood) {
		this.topWood = topWood;
	}

	public Wood getBackWood() {
		return backWood;
	}

	public void setBackWood(Wood backWood) {
		this.backWood = backWood;
	}

}
