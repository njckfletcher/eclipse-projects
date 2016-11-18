package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// player name
	String name;
	public void getName(String n) {
		this.name = n;
	}
	
	// player health
	int health = 100;
	
	// player inventory
	List<String> inv = new ArrayList<String>();
	int invWeight = 0;
	int invMaxWeight = 15;
	
	public void displayInventory() {
		System.out.println(this.inv);
	}
	public void displayInventoryWeight() {
		System.out.println(this.invWeight);
	}
	
	// player location 
	String location = "Room01";
	
	public void displayLocation() {
		System.out.println(location);
	}
	
	public void move(String whereTo) {
		switch(whereTo) {
			case "Room01": location = "Room01";
				break;
				
			case "Room02": location = "Room02";
				break;
		}
	}
}
