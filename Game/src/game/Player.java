package game;

import java.util.ArrayList;
import java.util.List;

public class Player {
	// player variables
	String name;
	
	public void getName(String n) {
		this.name = n;
	}
	
	int health = 100;
	
	//Inventory inventory = new Inventory();
	
	List<String> inv = new ArrayList<String>();
	
	// player location methods
	String location;
	
	public void getLocation(String loc) {
		if(loc.equalsIgnoreCase("Chamber")) {
			location = "Chamber";
		}
		else if(loc.equalsIgnoreCase("Lab")) {
			location = "Lab";
		}
	}
}
