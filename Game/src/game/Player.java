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
	
	// player location 
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
