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
	String[] finalText;
	boolean multiCommand = false;
	int numActions;
	int goCount = 0;
	String actions[] = {"health", 
						"inventory", 
						"location",
						"name", 
						"weight", 
						"goto", 
						"move",
						"go",
						"look",
						"take",
						"pickup",
						"pick",
						"grab"};
	List<String> activeActions = new ArrayList<String>();
	String[] exeActions;
	
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
		    	case "to":
		    	case "current":
		    	case "my":
		    	case "and":
		    	case "display":
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
		
		// Convert list to array
		finalText = new String[fixParts.size()];
		finalText = fixParts.toArray(finalText);
		
		// Determines active actions
		for(int i = 0; i < finalText.length; i++) {
			for(int o = 0; o < actions.length; o++) {
				if(finalText[i].equals(actions[o])) {
					numActions++;
					activeActions.add(actions[o]);
				}
			}
		}
		
		// Go count
		for(String s : finalText) {
			if(s.equals("go") || s.equals("move") || s.equals("goto")) {
				goCount++;
			}
		}
		
		// Convert list of actions to array of actions
		exeActions = new String[activeActions.size()];
		exeActions = activeActions.toArray(exeActions);
		
		/*
		// Output final text
		System.out.println("------------------------------------------");
		System.out.println("SYSTEM DATA:");
		System.out.print("Filtered text: ");
		for(String s : finalText) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// Output stats
		System.out.println("Word count: " + finalText.length);
		System.out.println("Number of Actions: " + numActions);
		System.out.print("Active actions: ");
		for(String s : exeActions) {
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("Go Count: " + goCount);
		*/
	}
	
	public void clearParser() {
		fixParts.clear();
		activeActions.clear();
		numActions = 0;
		goCount = 0;
	}
}
