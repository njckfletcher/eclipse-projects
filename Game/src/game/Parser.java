package game;

import java.util.Arrays;
import java.util.Scanner;

public class Parser {
	Scanner input = new Scanner(System.in);
	String rawCommand;
	String[] parts;
	
	// Parse Command Method
	public String parseCommand() {
		this.rawCommand = input.nextLine().toLowerCase();
		parts = rawCommand.split(" ");
		int removeThe;
		int removeAt;
		
		for (int i = 0; i < parts.length; i++)
		{
		    switch(i) {
		    	case :
		    }
		}
		
		/*
		if(Arrays.asList(parts).contains("the")) {
			
		}
		*/
		
		return "";
	}
}
