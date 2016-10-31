package game;

public class Lab {
	boolean firstVisit = true;
	boolean openingPromtUsed = false;
	Door exitDoor = new Door();
	Phone labPhone = new Phone();
	Desktop dekstop01 = new Desktop();
	String commandsAvailable[] = {"look at", 
								  "goto"};
	
	String textPrompts[] = {"You step out of the cryo-chamber.  Your legs wobble from slight " // [0] first visit statement
			+ "\nmuscular dystrophy as an effect of the cryosleep.  The room is full of "
			+ "\nuseless lab equiptment.  You see other chambers lined up alongside yours.  "
			+ "\nThey are all empty.  A desktop computer sits under a desk to your right "
			+ "\nwith a monitor atop the desk.  The monitor is displaying a login screen.  "
			+ "\nAhead, there is a door with an 'EXIT' sign above it.  In the far left "
			+ "\ncorner sits a staricase leading up.  Left of the staircase sits a desk "
			+ "\nwith a phone on it.", 
			"The lab is full of useless lab equipment.  Empty cryo-chambers sit lined up along the " // [1] with phone
			+ "\nback wall.  A desktop computer sits under a desk with a monitor atop the desk.  "
			+ "\nThe monitor is displaying a login screen.  There is a door with an 'EXIT' sign "
			+ "\nabove it and a staircase leading up.  Left of the staircase sits a desk with "
			+ "\na phone on it.",
			"The lab is full of useless lab equipment.  Empty cryo-chambers sit lined up along the "  // [2] without phone
			+ "\nback wall.  A desktop computer sits under a desk with a monitor atop the desk.  "
			+ "\nThe monitor is displaying a login screen.  There is a doot with an 'EXIT' sign "
			+ "\nabove it and a staircase leading up.  Left of the staircase sits a desk with "
			+ "\nnothing on it."};
}