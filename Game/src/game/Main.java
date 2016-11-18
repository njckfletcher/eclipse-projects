package game;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Instantiating Game Objects
		Chamber chamber = new Chamber();
		Lab lab = new Lab();
		Phone labPhone = new Phone();
		
		// COMMAND HANDLER:
		//Scanner input = new Scanner(System.in);
		//String command = input.next().toLowerCase();
		//String[] parts = command.split(" ");
		//if(parts.length == 2 && parts[0].equals("look")) {
		//	
		//}
		
		Player hero = new Player();
		
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
		
		
	}
}
