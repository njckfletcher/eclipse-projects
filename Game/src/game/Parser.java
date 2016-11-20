package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Parser {
	// Parser objects and variables
	Scanner input = new Scanner(System.in);
	String rawCommand;
	String[] rawParts;
	List<String> fixParts = new ArrayList<String>();
	boolean multiCommand = false;
	int numActions;
	String actions[] = {"health", "inventory", "location", "weight", "goto", "move"};
	
	// Parse Command Method
	public void parseCommand() {
		// Take user-input
		this.rawCommand = input.nextLine().toLowerCase();
		
		// Split input into parts[]
		rawParts = rawCommand.split(" ");
		
		// Filter words
		for(int i = 0; i < rawParts.length; i++) {
		    switch(rawParts[i]) {
		    	case "the": 
		    	case "an": 
		    	case "a":
		    		rawParts[i] = null;
		    	case "and":
		    		multiCommand = true;
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
		
		// Convert list to array
		String[] finalText = new String[fixParts.size()];
		finalText = fixParts.toArray(finalText);
		
		for(int i = 0; i < finalText.length; i++) {
			for(int o = 0; o < actions.length; o++) {
				if(finalText[i].equals(actions[o])) {
					numActions++;
				}
			}
		}
		
		
		// Output text
		for(String s : finalText) {
			System.out.print(s + " ");
		}
		
		
		System.out.println();
		
		// Output word count
		System.out.println("Word count: " + finalText.length);
		System.out.println("Number of Actions: " + numActions);
	}
}
