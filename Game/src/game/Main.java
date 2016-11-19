package game;

public class Main {
	public static void main(String[] args) {
		// System Objects
		Parser parse = new Parser();
		String command;
		boolean running = true;
		
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
		
		System.out.print("Input: ");
		parse.parseCommand();
		
		//if(parse.fixParts.contains("location")) {
		//	hero.displayLocation();
		//}
	}
}
