package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// player name
	String name = "player";
	public void getName(String n) {
		this.name = n;
	}
	
	// player health
	int health = 100;
	
	public void displayHealth() {
		System.out.println("Health: " + this.health + "%");
	}
	
	// player inventory
	List<String> inv = new ArrayList<String>();
	int invWeight = 0;
	int invMaxWeight = 15;
	
	public void displayInventory() {
		System.out.println("Inventory: " + this.inv);
	}
	public void displayWeight() {
		System.out.println("Weight: " + this.invWeight);
	}
	
	// player location 
	String location = "Room01";
	
	public void displayLocation() {
		System.out.println("Location: " + location);
	}
	
	public void move(String whereTo) {
		switch(whereTo) {
			case "Room01": 
				if(location == "Room01") {
					System.out.println("You are already in Room01");
				}
				else {
					location = "Room01";
					System.out.println(name + " moved to Room01");
				}
				break;
				
			case "Room02": 
				if(location == "Room02") {
					System.out.println("You are already in Room02");
				}
				else {
					location = "Room02";
					System.out.println(name + " moved to Room02");
				}
				break;
		}
	}
}
