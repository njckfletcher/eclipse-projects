package tutorials.basic;

public class Methods {
	public static void main(String[] args) { 
		sayHelloWorld();
		
		sayHelloTo("Charlie");
		sayHelloTo("John");
		
		int x = returnFive();
		
		System.out.println(x);
		
		int result = square(returnFive());
		
		System.out.println(result);
		System.out.println(square(returnFive()));		
	}
	
	// this method both returns a value and takes in data
	static int square(int x) {
		return x * x;
	}
	
	// this method returns an int type with the value 5
	static int returnFive() {
		return 5;
	}
	
	// this method will say hello to whatever name is passed when called
	static void sayHelloTo(String name) {
		System.out.println("Hello, " + name);
	}
	
	// this method simply says "Hello World!"
	static void sayHelloWorld() {
		System.out.println("Hello World!");
	}
}
