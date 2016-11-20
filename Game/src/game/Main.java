package game;

public class Main {
	public static void main(String[] args) {
		// System Objects
		Parser parse = new Parser();
		String command;
		boolean commandInProgress = true;
		
		// Instantiating Game Objects
		Player hero = new Player();
		
		COMMAND:
		while(commandInProgress) {
			System.out.println("------------------------------------------");
			System.out.print("Input: ");
			parse.parseCommand();
			
			if(parse.fixParts.contains("location")) {
				hero.displayLocation();
			}
			
			else if(parse.fixParts.contains("inventory")) {
				hero.displayInventory();
			}
			
			else if(parse.fixParts.contains("weight")) {
				hero.displayWeight();
			}
			
			else if(parse.fixParts.contains("health")) {
				hero.displayHealth();
			}
			
			else if(parse.fixParts.contains("move") 
				 || parse.fixParts.contains("goto")) {
				if(parse.fixParts.contains("room01")) {
					hero.move("Room01");
				}
				
				if(parse.fixParts.contains("room02")) {
					hero.move("Room02");
				}
			}
			else {
				System.out.println("Invalid command.");
			}
			
			parse.fixParts.clear();
			parse.numActions = 0;
			//System.out.println();
			
			
		}
	}
}
