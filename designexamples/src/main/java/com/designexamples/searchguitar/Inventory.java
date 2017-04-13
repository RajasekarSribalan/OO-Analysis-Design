package com.designexamples.searchguitar;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author xbeffij
 * 
 *         class Inventory
 * 
 *         This Class is designed such way to hold the list of Guitars.Shop
 *         owner can add the Guitars to the inventory and search the guitars
 *         when it is required.These are simple operations but can help us to
 *         learn object oriented design and principles.This functionality will
 *         be modified accordingly to have proper OOP design and structure.
 * 
 */
public class Inventory {

	private List<Guitar> guitars;

	public Inventory() {
		guitars = new LinkedList<Guitar>();
	}

	/**
	 * Method Add Guitar
	 * 
	 * @param serialNumber
	 * @param builder
	 * @param model
	 * @param type
	 * @param backWood
	 * @param topWood
	 */
	public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood) {

		Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood);
		guitars.add(guitar);
	}

	/**
	 * Method getGuitar
	 * 
	 * @param serialNumber
	 * @return
	 */
	public Guitar getGuitar(String serialNumber) {
		for (Guitar guitar : guitars) {
			if (serialNumber.equalsIgnoreCase(guitar.getSerialNumber())) {
				return guitar;
			}
		}
		return null;
	}

	/**
	 * Method Search Guitar
	 * 
	 * @param searchGuitar
	 * @return
	 */
	public Guitar search(Guitar searchGuitar) {
		for (Guitar guitar : guitars) {
			String builder = searchGuitar.getBuilder();
			if (null != builder && !"".equalsIgnoreCase(builder) && !builder.equalsIgnoreCase(guitar.getBuilder())) {
				continue;
			}
			String model = searchGuitar.getModel();
			if (null != model && !"".equalsIgnoreCase(model) && !model.equalsIgnoreCase(guitar.getModel())) {
				continue;
			}
			String type = searchGuitar.getType();
			if (null != type && !"".equalsIgnoreCase(type) && !type.equalsIgnoreCase(guitar.getType())) {
				continue;
			}
			String backwood = searchGuitar.getBackWood();
			if (null != backwood && !"".equalsIgnoreCase(backwood) && !backwood.equalsIgnoreCase(guitar.getBackWood())) {
				continue;
			}
			String topwood = searchGuitar.getTopWood();
			if (null != topwood && !"".equalsIgnoreCase(topwood) && !topwood.equalsIgnoreCase(guitar.getTopWood())) {
				continue;
			}
			return guitar;

		}
		return null;
	}
}
