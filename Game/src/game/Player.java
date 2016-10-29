package game;

public class Player {
	String name;
	
	public void getName(String n) {
		this.name = n;
	}
	
	int health = 100;
	
	String location;
	
	public void getLocation(String loc) {
		if(loc.equalsIgnoreCase("Chamber")) {
			location = "Chamber";
		}
	}
}
