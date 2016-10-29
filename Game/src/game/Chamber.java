package game;

public class Chamber {
	Button emergencyRelease = new Button();
	Door door = new Door();
	String commandsAvailable[] = {"press", 
								  "look", 
								  "goto", 
								  "leave", 
								  "exit"};
	
	String textPrompts[] = {"Your eyes open.  Still shivering from the cold, you look \naround as the chamber fog begins to disappear.  Red flahing lights \ncan be seen out a small window in front of you.  You see a button \nthat says \"Emergency Latch Release\".", 
							"The door opens.  An alarm echos repeatedly.  Ahead is a dark room \nwith red flashing lights.", 
							"The chamber is bare of detail.  Red light flashes in from the window in front of you.  \nNothing much to look at other than the button...", 
							"The chamber is bare of detail.  Red light pours in from the opening \nin front of you.  The dark room seems to be cluttered..."};
}
