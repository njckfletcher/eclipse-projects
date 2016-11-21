package game;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
		boolean commandInProgress = true;
		Parser parse = new Parser();
		Player hero = new Player();
		
		while(commandInProgress) {
			System.out.print("Input: ");
			parse.parseCommand();
			System.out.println("------------------------------------------");
			
			if(parse.exeActions.length == 0) {
				System.out.println("Invalid command.");
			}
			
			for(int o = 0; o < parse.exeActions.length; o++) {
				
				
				int actionLoc = Arrays.asList(parse.finalText).indexOf(parse.exeActions[o]);
				int actionArg = actionLoc + 1;
				
				boolean argPresent;
				
				if(!(parse.finalText.length <= actionArg)) {
					argPresent = true;
				}
				else {
					argPresent = false;
				}
				
				/*
				System.out.println("Arg Present: " + argPresent);
				System.out.println("Action appears at: " + actionLoc);
				System.out.println("Arg after action (if present) would appear at: " + actionArg);
				*/
				
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
					 || parse.exeActions[o].equals("goto")
					 || parse.exeActions[o].equals("go")) {
					if(argPresent) {
						if(parse.finalText[actionLoc + 1].equals("room01")) {
							hero.move("Room01");
						}
						else if(parse.finalText[actionLoc + 1].equals("room02")) {
							hero.move("Room02");
						}
						else {
							System.out.println(parse.exeActions[o] + " where?");
						}
					}
					else {
						System.out.println(parse.exeActions[o] + " where?");
					}
					
				}
			}
			parse.fixParts.clear();
			parse.activeActions.clear();
			parse.numActions = 0;
			parse.goCount = 0;
			System.out.println("------------------------------------------");
			
		}
	}
}
