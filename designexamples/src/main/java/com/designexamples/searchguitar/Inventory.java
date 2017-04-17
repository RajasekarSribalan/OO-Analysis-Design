package com.designexamples.searchguitar;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.designexamples.searchguitar.enums.Builder;
import com.designexamples.searchguitar.enums.Type;
import com.designexamples.searchguitar.enums.Wood;

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
	public void addGuitar(String serialNumber, Builder builder, String model, Type type, Wood backWood, Wood topWood, double price) {

		Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
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
	public List<Guitar> search(Guitar searchGuitar) {
		List<Guitar> matchingGuitars = new ArrayList<Guitar>();
		for (Guitar guitar : guitars) {
			if (searchGuitar.getBuilder() != guitar.getBuilder()) {
				continue;
			}
			String model = searchGuitar.getModel().toLowerCase();
			if (null != model && !"".equalsIgnoreCase(model) && !model.equalsIgnoreCase(guitar.getModel().toLowerCase())) {
				continue;
			}
			if (searchGuitar.getType() != guitar.getType()) {
				continue;
			}
			if (searchGuitar.getBackWood() != guitar.getBackWood()) {
				continue;
			}
			if (searchGuitar.getTopWood() != guitar.getTopWood()) {
				continue;
			}
			matchingGuitars.add(guitar);
		}
		return matchingGuitars;
	}
}
