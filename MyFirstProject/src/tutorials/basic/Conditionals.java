package tutorials.basic;

public class Conditionals {
	public static void main(String[] args) {
		
		// if (some expression that evaluates to true)
		//		do something
		
		boolean sayHello = false;
		boolean sayHey = true;
		
		// only the first statement to evaluate to true gets executed
		if(sayHello) {
			System.out.println("Hello");
		} else if(sayHey) {
			System.out.println("Hey");
		} else {
			System.out.println("Goodbye");
		}
		
		// >, <, >=, <=, !=, == relational opertators, can also use boolean variables
		
		// if(x = 5)  assign 5 to x
		// if(x == 5) test whether x has the value of 5 (it will either be true or false)
		
		// && AND, || OR
		
		int playerX = 800;
		
		if(false && true) {
			System.out.println("AND executed");
		}
		
		// if our player is past the left side of the screen, or if our player is
		// past the right side of the screen
		if(playerX < 0 || playerX >= 800) {
			// some code that reverses our player's direction
			System.out.println("Player direction is out of bounds.");
		}
	}
}
