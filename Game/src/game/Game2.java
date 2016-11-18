package game;

import java.util.Scanner;

public class Game2 {
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
			hero.getLocation("Chamber"); // assigns player's first location to the Chamber
			
			// map locations creation
			Chamber chamber = new Chamber();
			Lab lab = new Lab();
			
			//map items
			Phone labPhone = new Phone();
			lab.inv.add("Lab Phone");
			
			
			
			
			while(hero.health > 0) {

				CHAMBER:
				while(hero.location.equals("Chamber")) {
					System.out.println("------------------------------------------");
					System.out.println(chamber.textPrompts[0]);
					System.out.println("------------------------------------------");
					System.out.println(">>>TIP: The following commands are available at any given time:"
							+ "\n'help'"
							+ "\n'look around'"
							+ "\n'health'"
							+ "\n'location'"
							+ "\n'inventory'"
							+ "\n'inventory weight'");
						
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
						else if(decision.equalsIgnoreCase("inventory")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.inv);
						}
						else if(decision.equalsIgnoreCase("inventory weight")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.invWeight);
						}
						else if(decision.equalsIgnoreCase("health")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.health);
						}
						else if(decision.equalsIgnoreCase("location")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.location);
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
						else if(decision.equalsIgnoreCase("inventory")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.inv);
						}
						else if(decision.equalsIgnoreCase("inventory weight")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.invWeight);
						}
						else if(decision.equalsIgnoreCase("health")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.health);
						}
						else if(decision.equalsIgnoreCase("location")) {
							System.out.println("------------------------------------------");
							System.out.println(hero.location);
						}
						else {
							System.out.println("------------------------------------------");
							System.out.println(">>>" + systemPrompts[1]);
						}
					} 
				}
				
				LAB:
				while(hero.location.equals("Lab")) {
					while(lab.openingPromtUsed == false) {
						if(lab.firstVisit) {
							System.out.println("------------------------------------------");
							System.out.println(lab.textPrompts[0]);
							System.out.println("------------------------------------------");
							System.out.println(">>>This location will now be referred to as the 'lab'");
							lab.firstVisit = false;
							lab.openingPromtUsed = true;
						}
						else {
							System.out.println("------------------------------------------");
							if(hero.inv.contains("labPhone")) {
								System.out.println(lab.textPrompts[1]);
								lab.openingPromtUsed = true;
							} else {
								System.out.println(lab.textPrompts[2]);
								lab.openingPromtUsed = true;
							}
						}
					}
					System.out.println("------------------------------------------");
					System.out.print(systemPrompts[0]);
					decision = input.nextLine();
					
					if(decision.equalsIgnoreCase("take phone")) {
						if(hero.invWeight + labPhone.weight > 15) {
							System.out.println("You cannot pick up the phone because your inventory is full!");
						}
						else {
							lab.inv.remove("Lab Phone");
							hero.inv.add("Lab Phone");
							hero.invWeight += labPhone.weight;
							System.out.println("------------------------------------------");
							System.out.println("You picked up the phone.");
						}
					}
					else if(decision.equalsIgnoreCase("inventory")) {
						System.out.println("------------------------------------------");
						System.out.println(hero.inv);
					}
					else if(decision.equalsIgnoreCase("inventory weight")) {
						System.out.println("------------------------------------------");
						System.out.println(hero.invWeight);
					}
					else if(decision.equalsIgnoreCase("health")) {
						System.out.println("------------------------------------------");
						System.out.println(hero.health);
					}
					else if(decision.equalsIgnoreCase("location")) {
						System.out.println("------------------------------------------");
						System.out.println(hero.location);
					}
					else if(decision.equalsIgnoreCase("leave lab")) {
						lab.openingPromtUsed = false;
						break LAB;
					}
				}
				
				
				
			}
		}
	}
}
