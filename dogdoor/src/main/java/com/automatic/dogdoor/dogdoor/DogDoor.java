package com.automatic.dogdoor.dogdoor;

/**
 * Hello world!
 *
 */
public class DogDoor 
{
  
	private boolean open;
	
	public DogDoor(){
		this.open = false;
	}
	
	//Open door
	public void open (){
		this.open = true;
	}
	
	//Close door
	public void close(){
		this.open = false;
	}
	
	public boolean isOpen(){
		return open;
	}
}
