package game;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// System objects
		Scanner input = new Scanner(System.in);
		
		boolean running = true;
		
		while(running) {
			// game variables
			String systemPrompts[] = {"What do you want to do?: ", "Invalid command.  Try 'help'"};
			String decision;
			
			// main character creation
			Player hero = new Player();
			System.out.print("Enter your name: ");
			hero.getName(input.nextLine());
			
			while(hero.health > 0) {
				hero.getLocation("Chamber");
				// first room, chamber, created
				Chamber chamber = new Chamber();
				
				CHAMBER:
				while(hero.location.equals("Chamber")) {
					System.out.println("------------------------------------------");
					System.out.println(chamber.textPrompts[0]);
					System.out.println("------------------------------------------");
					System.out.println(">>>TIP: The following commands are available at any given time:"
							+ "\n'help'"
							+ "\n'look around'");  // 'current location', 'current health'
						
					while(chamber.door.open == false) {						
						System.out.println("------------------------------------------");
						System.out.print(systemPrompts[0]);
						decision = input.nextLine(); 
						
						if(decision.equalsIgnoreCase("press button") 
						|| decision.equalsIgnoreCase("press the button")
						|| decision.equalsIgnoreCase("push button") 
						|| decision.equalsIgnoreCase("push the button")) {
							chamber.door.getCondition(true);
						}
						else if(decision.equalsIgnoreCase(chamber.commandsAvailable[0]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[1]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[2]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[3]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[4]) ||
								decision.equalsIgnoreCase(chamber.commandsAvailable[5])) {
							System.out.println("------------------------------------------");
							if(decision.equalsIgnoreCase("look")) {
								System.out.println("'look' at what?");
							}
							else if(decision.equalsIgnoreCase(chamber.commandsAvailable[2]) ||
									decision.equalsIgnoreCase(chamber.commandsAvailable[3]) ||
									decision.equalsIgnoreCase(chamber.commandsAvailable[4]) ||
									decision.equalsIgnoreCase(chamber.commandsAvailable[5])) {
								System.out.println("The door must be opened first.");
							}
							else{
								System.out.println("'" + decision + "' what?");
							}
						}
						else if(decision.equalsIgnoreCase("look around")) {
							System.out.println("------------------------------------------");
							System.out.println(chamber.textPrompts[2]);
						}
						else if(decision.equalsIgnoreCase("help")) {
							System.out.println("------------------------------------------");
							System.out.println(">>>Try '" + chamber.commandsAvailable[0] + "' or '" 
														  + chamber.commandsAvailable[1] + "'");
						}
						else {
							System.out.println("------------------------------------------");
							System.out.println(">>>" + systemPrompts[1]);
						}
					}
					
					boolean stateOn = true;
					
					while(chamber.door.open == true) {
						if(stateOn == true) {
							System.out.println("------------------------------------------");
							System.out.println(chamber.textPrompts[1]);
						}
						stateOn = false;
						
						System.out.println("------------------------------------------");
						System.out.print(systemPrompts[0]);
						decision = input.nextLine();
						
						if(decision.equalsIgnoreCase("press button")
						|| decision.equalsIgnoreCase("press the button")
						|| decision.equalsIgnoreCase("push button")
						|| decision.equalsIgnoreCase("push the button")) {
							System.out.println("------------------------------------------");
							System.out.println("The door doesn't close from the inside.");
						}
						else if(decision.equalsIgnoreCase("goto dark room") 
							 || decision.equalsIgnoreCase("goto the dark room") 
							 || decision.equalsIgnoreCase("exit chamber") 
							 || decision.equalsIgnoreCase("exit the chamber") 
							 || decision.equalsIgnoreCase("leave chamber") 
							 || decision.equalsIgnoreCase("leave the chamber")
							 || decision.equalsIgnoreCase("goto flashing lights")
							 || decision.equalsIgnoreCase("goto the flashing lights")) {
							hero.getLocation("Lab");
							break CHAMBER;
						} 
						else if(decision.equalsIgnoreCase("look around")) {
							System.out.println("------------------------------------------");
							System.out.println(chamber.textPrompts[3]);
						}
						else if(decision.equalsIgnoreCase("help")) {
							System.out.println("------------------------------------------");
							System.out.println(">>>Try '" + chamber.commandsAvailable[2] + "', '" 
														  + chamber.commandsAvailable[1] + "', '" 
														  + chamber.commandsAvailable[3] + "', or '" 
														  + chamber.commandsAvailable[4] + "'");
						}
						else {
							System.out.println("------------------------------------------");
							System.out.println(">>>" + systemPrompts[1]);
						}
					} 
				}
				
				Lab lab = new Lab();
				
				LAB:
				while(hero.location.equals("Lab")) {
					if(lab.firstVisit) {
						System.out.println("------------------------------------------");
						System.out.println(lab.textPrompts[0]);
						lab.firstVisit = false;
					}
					else {
						System.out.println("------------------------------------------");
						if(hero.inv.contains("labPhone")) {
							System.out.println(lab.textPrompts[1]);
						} else {
							System.out.println(lab.textPrompts[2]);
						}
					}
					System.out.println("------------------------------------------");
					System.out.print(systemPrompts[0]);
					decision = input.nextLine(); 
				}
			}
		}
	}
}
