package game;

import java.util.Scanner;

public class Old {
	public static void main(String[] args) {
		Player hero = new Player();
		Scanner input = new Scanner(System.in);
		String dialog = "\n\tWhat do you do next?";
		String decision;
		boolean doorOpen = false;
		boolean running = true;
		
		System.out.println("Your eyes open.  Still shivering from the cold, you look "
				+ "\naround as the chamber fog begins to disappear.  Red flahing lights "
				+ "\ncan be seen out the small window in front of you.  You see a button "
				+ "\nthat says \"Emergency Latch Release\".");
		System.out.println(dialog);
		decision = input.nextLine();
		
		if(decision.equalsIgnoreCase("press button") || decision.equalsIgnoreCase("open latch")) {
			doorOpen = true;
		}
		else {
			System.out.println("Invalid command.");
		}
		
		if(doorOpen == true) {
			System.out.println("The chamber door slides open.");
		}
	}
}
