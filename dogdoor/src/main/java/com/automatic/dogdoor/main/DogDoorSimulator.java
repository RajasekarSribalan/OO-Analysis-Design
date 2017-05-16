package com.automatic.dogdoor.main;

import com.automatic.dogdoor.dogdoor.DogDoor;
import com.automatic.dogdoor.dogdoor.Remote;

public class DogDoorSimulator {
 
	public static void main(String args[]){
		DogDoor dogDoor = new DogDoor();
		Remote remote = new Remote(dogDoor);
		System.out.println("Jarvis barks and goes outside!!!!!");
		remote.pressButton();
		System.out.println("Jarvis barks and comes in!!!!!");
		remote.pressButton();
		System.out.println("Jarvis again barks for going out!!!!!");
		remote.pressButton();
		System.out.println("Jarvis came in!!!!!");
		remote.pressButton();
		
	}
 
}
