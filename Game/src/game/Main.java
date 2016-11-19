package game;

public class Main {
	public static void main(String[] args) {
		// System Objects
		Parser parse = new Parser();
		String command;		
		
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
		
		System.out.print("Input something random: ");
		parse.parseCommand();
		
	}
}
