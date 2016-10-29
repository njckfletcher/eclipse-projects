package game;

public abstract class GameObject {
	
	private int x;
	
	public void blah() {
		
	}
	
	// this method must be implemented by any class that extends GameObject
	public abstract void draw();
	
	public static void main(String[] args) {
		Player player = new Player();
		player.someMethod();
		// player.draw();
		
		Menu menu = new Menu();
		// menu.draw();
		
		GameObject[] gameobjects = new GameObject[2];
		gameobjects[0] = player;
		gameobjects[1] = menu;
		
		for(GameObject obj : gameobjects) {
			obj.draw();
		}
		// GameObject myObject = new GameObject();
		// abstract classes exist to be extended, they can not be instantiated
	}
}

