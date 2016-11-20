package game;

public class Main {
	public static void main(String[] args) {
		// System Objects
		Parser parse = new Parser();
		String command;
		boolean commandInProgress = true;
		
		// Instantiating Game Objects
		Player hero = new Player();
		
		/*
		hero.displayInventory();
		hero.displayInventoryWeight();
		hero.displayLocation();
		
		System.out.println();
		
		hero.inv.add("Phone");
		hero.invWeight += 1;
		hero.move("Room02");
		
		hero.displayInventory();
		hero.displayInventoryWeight();
		hero.displayLocation();
		*/
		while(commandInProgress) {
			System.out.print("Input: ");
			parse.parseCommand();
			
			if(parse.fixParts.contains("location")) {
				hero.displayLocation();
			}
			
			if(parse.fixParts.contains("inventory")) {
				hero.displayInventory();
			}
			
			if(parse.fixParts.contains("weight")) {
				hero.displayWeight();
			}
			
			if(parse.fixParts.contains("health")) {
				hero.displayHealth();
			}
			
			if(parse.fixParts.contains("move") 
			|| parse.fixParts.contains("goto")) {
				if(parse.fixParts.contains("room01")) {
					hero.move("Room01");
				}
				
				if(parse.fixParts.contains("room02")) {
					hero.move("Room02");
				}
			}
			
			parse.fixParts.clear();
			System.out.println();
			
			
		}
	}
}
