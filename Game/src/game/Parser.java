package game;

import java.util.Scanner;

public class Parser {
	Scanner input = new Scanner(System.in);
	String rawCommand;
	String[] parts;
	
	// Parse Command Method
	public String parseCommand() {
		this.rawCommand = input.nextLine().toLowerCase();
		parts = rawCommand.split(" ");
		
		return "";
	}
}
