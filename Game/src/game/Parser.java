package game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Parser {
	// Parser objects and variables
	Scanner input = new Scanner(System.in);
	String rawCommand;
	String[] rawParts;
	List<String> fixParts = new ArrayList<String>();
	String actions[] = {"health", "inventory", "location"};
	
	// Parse Command Method
	public void parseCommand() {
		// Take user-input
		this.rawCommand = input.nextLine().toLowerCase();
		
		// Split input into parts[]
		rawParts = rawCommand.split(" ");
		
		// Filter out words
		for(int i = 0; i < rawParts.length; i++) {
		    switch(rawParts[i]) {
		    case "the": case "an": case "a":
		    	rawParts[i] = null;
		    	break;
		    }
		}
		
		/*
		// List array items
		for(int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
		*/
		
		// Add words to list
		for(int i = 0; i < rawParts.length; i++) {
			if(rawParts[i] != null) {
				fixParts.add(rawParts[i]);
			}
		}
		
		
		
		//System.out.println(fixParts);
		
	}
}
