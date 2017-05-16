package com.automatic.dogdoor.dogdoor;

public class Remote {

	private DogDoor dogDoor;

	public Remote(DogDoor dogDoor) {
		this.dogDoor = dogDoor;
	}

	public void pressButton() {
		System.out.println("Pressing remote control button...");
		if (dogDoor.isOpen()) {
			dogDoor.close();
		} else {
			dogDoor.open();
		}
	}
}
