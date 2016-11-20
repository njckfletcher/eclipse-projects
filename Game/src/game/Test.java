package game;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		boolean commandInProgress = true;
		Parser parse = new Parser();
		Player hero = new Player();
		
		while(commandInProgress) {
			System.out.println("------------------------------------------");
			System.out.print("Input: ");
			parse.parseCommand();
			
			
			for(int o = 0; o < parse.exeActions.length; o++) {
				
				int actionLoc = Arrays.asList(parse.finalText).indexOf(parse.exeActions[o]);
				//System.out.println("Action appears at: " + actionLoc);
				
				if(parse.exeActions[o].equals("location")) {
					hero.displayLocation();
				}
				else if(parse.exeActions[o].equals("inventory")) {
					hero.displayInventory();
				}
				else if(parse.exeActions[o].equals("weight")) {
					hero.displayWeight();
				}
				else if(parse.exeActions[o].equals("health")) {
					hero.displayHealth();
				}
				else if(parse.exeActions[o].equals("move") 
					 || parse.exeActions[o].equals("goto")) {
					if(parse.finalText[actionLoc + 1].equals("room01")) {
						hero.move("Room01");
					}
					if(parse.finalText[actionLoc + 1].equals("room02")) {
						hero.move("Room02");
					}
				}
				else {
					System.out.println("Invalid command.");
				}
			}
			parse.fixParts.clear();
			parse.activeActions.clear();
			parse.numActions = 0;
			
			
			//System.out.println();
			
			
		}
	}
}
