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
					System.out.println(">>>TIP: When stuck, try 'help'.  Also, you can 'look around' "
							+ "\nat any given time.");
						
					while(chamber.door.open == false) {						
						System.out.println("------------------------------------------");
						System.out.print(systemPrompts[0]);
						decision = input.nextLine(); 
						
						if(decision.equalsIgnoreCase("press button") || decision.equalsIgnoreCase("press the button")) {
							chamber.door.getCondition(true);
						}
						else if(decision.equalsIgnoreCase(chamber.commandsAvailable[0]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[1]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[2]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[3]) || 
								decision.equalsIgnoreCase(chamber.commandsAvailable[4])) {
							System.out.println("------------------------------------------");
							if(decision.equalsIgnoreCase("look")) {
								System.out.println("'look' at what?");
							}
							else {
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
						
						if(decision.equalsIgnoreCase("press button")) {
							System.out.println("The door doesn't close from the inside.");
						}
						/* else if(decision.equalsIgnoreCase("goto dark room")) || 
						decision.equalsIgnoreCase("goto the dark room")) || 
						decision.equalsIgnoreCase("leave chamber") || 
						decision.equalsIgnoreCase("leave the chamber")) || 
						decision.equalsIgnoreCase("exit chamber")) || 
						decision.equalsIgnoreCase("exit the chamber")) {
							System.out.println("------------------------------------------");
							System.out.println(chamber.textPrompts[3]);
						} */
						else if(decision.equalsIgnoreCase("look around")) {
							System.out.println("------------------------------------------");
							System.out.println(chamber.textPrompts[3]);
						}
						else if(decision.equalsIgnoreCase("help")) {
							System.out.println("------------------------------------------");
							System.out.println(">>>Try '" + chamber.commandsAvailable[2] + "', '" 
														  + chamber.commandsAvailable[1] + "', '" 
														  +  chamber.commandsAvailable[3] + "', or '" 
														  + chamber.commandsAvailable[4] + "'");
						}
						else {
							System.out.println("------------------------------------------");
							System.out.println(">>>" + systemPrompts[1]);
						}
					} 
				}
			}
		}
	}
}
