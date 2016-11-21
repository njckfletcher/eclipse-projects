package game;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		// System Objects
		Parser parse = new Parser();
		boolean commandInProgress = true;
		boolean running = true;
		String systemPrompts[] = {"What do you want to do?: ", "What now?: ", "What would you like to do next?: ", "Enter your command(s): "};
		
		while(running) {
			// Instantiating Game Objects
			Player hero = new Player();
			
			// GAME START:
			System.out.println("Welcome to the game!");
			System.out.println();
			System.out.println("Current working commands:");
			System.out.println("health"
							 + "\nlocation"
							 + "\ninventory"
							 + "\nweight"
							 + "\ngo, goto, move");
			System.out.println();
			System.out.println("Multiple commands can be passed through at the same time."
					+ "\nTry 'health weight location inventory', in any order.");
			System.out.println();
			System.out.println("Currently, the only locations available are Room01 and Room02.");
			System.out.println();
			System.out.println("The following filler words are removed from the input:");
			System.out.println("the, an, a, and, my, current");
			System.out.println("So, 'my health', 'current health', and 'health' will all"
					+ "\nreturn the players health.");
			System.out.println("------------------------------------------");
			System.out.print("Please enter your name: ");
			hero.getName(parse.input.nextLine());
			System.out.println("------------------------------------------");
			
			COMMAND:
			while(commandInProgress) {
				int randPrompt = new Random().nextInt(systemPrompts.length);
				System.out.print(systemPrompts[randPrompt]);
				parse.parseCommand();
				System.out.println("------------------------------------------");
				
				if(parse.exeActions.length == 0) {
					System.out.println("Invalid command.");
				}
				
				// For the number of actions being executed
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
				parse.clearParser();
				System.out.println("------------------------------------------");
				
			}
		}	
	}
}
