package game;

public class Test {
	public static void main(String[] args) {
		Handle handle = new Handle();
		Player hero = new Player();
		
		System.out.print("Input: ");
		handle.parseCommand();
	}
}
