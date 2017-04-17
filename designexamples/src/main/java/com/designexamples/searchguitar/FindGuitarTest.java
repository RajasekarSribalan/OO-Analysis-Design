package com.designexamples.searchguitar;

import java.util.List;

import com.designexamples.searchguitar.enums.Builder;
import com.designexamples.searchguitar.enums.Type;
import com.designexamples.searchguitar.enums.Wood;

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

		Guitar WhatUserWants = new Guitar("", Builder.FLYN, "", Type.ELECTRIC, Wood.BRAZIL_WOOD, Wood.BRAZIL_WOOD, 0);
		List<Guitar> outputGuitar = inventory.search(WhatUserWants);
		if (null != outputGuitar) {
			System.out.println("Hey User,you might like these Guitars!!!");
			for (Guitar guitar : outputGuitar) {
				System.out.println("We have " + " " + guitar.getBuilder() + " \n" + guitar.getModel() + " \n" + guitar.getPrice() + " \n"
						+ guitar.getType() + " \n" + guitar.getTopWood() + " \n" + guitar.getBackWood());
				System.out.println("=================================");
			}

		} else {
			System.out.println("Sorry, Please refine your search criteria.No results found!!");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		inventory.addGuitar("V12878", Builder.FLYN, "Jumbo", Type.ELECTRIC, Wood.BRAZIL_WOOD, Wood.BRAZIL_WOOD, 876);
		inventory.addGuitar("V12892", Builder.FLYN, "Strocoaster", Type.ELECTRIC, Wood.BRAZIL_WOOD, Wood.BRAZIL_WOOD, 988);
		inventory.addGuitar("V12879", Builder.HOLLY, "sds", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD, Wood.BRAZIL_WOOD, 123);
		inventory.addGuitar("V12880", Builder.JESSE, "Pink", Type.ELECTRIC, Wood.MODERN_WOOD, Wood.INDIAN_ROSEWOOD, 234);
		inventory.addGuitar("V12872", Builder.SKYLER, "White", Type.ACOUSTIC, Wood.PLY_WOOD, Wood.BRAZIL_WOOD, 762);
		inventory.addGuitar("V12873", Builder.WALT, "Breaking", Type.ELECTRIC, Wood.INDIAN_ROSEWOOD, Wood.PLY_WOOD, 872);
		inventory.addGuitar("V12874", Builder.WALT, "Bad", Type.ACOUSTIC, Wood.BRAZIL_WOOD, Wood.MODERN_WOOD, 875);

	}
}