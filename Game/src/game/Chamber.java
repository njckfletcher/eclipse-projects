package game;

public class Chamber {
	Button emergencyRelease = new Button();
	Door door = new Door();
	String commandsAvailable[] = {"press", "goto", "leave", "exit"};
	
	String textPrompts[] = {"Your eyes open.  Still shivering from the cold, you look "
			+ "\naround as the chamber fog begins to disappear.  Red flahing lights "
			+ "\ncan be seen out a small window in front of you.  You see a button "
			+ "\nthat says \"Emergency Latch Release\".", "The door opens.  An alarm echos repeatedly.  Ahead is a dark room " 
			+ "\nwith red lights flashing."};
}
