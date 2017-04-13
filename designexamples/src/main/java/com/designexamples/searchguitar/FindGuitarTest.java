package com.designexamples.searchguitar;

public class FindGuitarTest {

	/**
	 * Main method
	 * 
	 * To test simple Guitar search app.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Guitar WhatUserWants = new Guitar("V12178", "Romeo", "Jumbo", "electric", "Plywood", "modernply");
		Guitar outputGuitar = inventory.search(WhatUserWants);
		if (null != outputGuitar) {
			System.out.println("User,You might like this" + " " + outputGuitar.getBuilder() + " " + outputGuitar.getModel() + " "
					+ outputGuitar.getPrice() + " " + outputGuitar.getType() + " " + outputGuitar.getTopWood() + " " + outputGuitar.getBackWood());

		} else {
			System.out.println("Sorry, Please refine your search criteria.No results found!!");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addGuitar("V12878", "Arnold", "Frind", "Mechanical", "Wood1", "Black");
		inventory.addGuitar("V12879", "Walter", "White", "electric", "Wood1", "Grey");
		inventory.addGuitar("V12880", "Jessie", "Pinkman", "electric", "Steek", "Orange");
		inventory.addGuitar("V12881", "Hank", "ASAC", "Mechanical", "Wood1", "White");
		inventory.addGuitar("V12882", "Skyler", "White", "Mechanical", "Teak", "Brown");
		inventory.addGuitar("V12178", "Romeo", "Jumbo", "electric", "Plywood", "modernply");

	}

}
