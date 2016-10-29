package game;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		// System objects
		Scanner input = new Scanner(System.in);
		
		boolean running = true;
		
		while(running) {
			// game variables
			String systemPrompts[] = {"What do you want to do?: ", "Invalid command.  Try \"help\"."};
			String decision;
			
			// main character creation
			Player hero = new Player();
			System.out.print("Enter your name: ");
			hero.getName(input.nextLine());
			
			while(hero.health > 0) {
				hero.getLocation("Chamber");
				// first room, chamber, created
				Chamber chamber = new Chamber();
				
				while(hero.location.equals("Chamber")) {
					System.out.println("------------------------------------------");
					System.out.println("Your eyes open.  Still shivering from the cold, you look "
						+ "\naround as the chamber fog begins to disappear.  Red flahing lights "
						+ "\ncan be seen out the small window in front of you.  You see a button "
						+ "\nthat says \"Emergency Latch Release\".");
					
					System.out.print("\n" + systemPrompts[0]);
					decision = input.nextLine(); 
					
					if(decision.equalsIgnoreCase("press button")) {
						chamber.door.getCondition(true);
					}
					else if(decision.equalsIgnoreCase("help")) {
						System.out.println("Try '" + chamber.commandsAvailable[0] + "'");
					}
					else {
						System.out.println(systemPrompts[1]);
					}
				}
			}
		}
	}
}
