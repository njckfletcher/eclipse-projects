package tutorials.basic;

public class ReferenceAndVallueTypes {
	public static void main(String[] args) {
		// byte, short, int, long, float, double, boolean, char
		
		int x = 5;
		addOneTo(x);  // we're passing a value type, so we pass a copy of the value x, which is 5
		
		System.out.println(x);
		
		Person john;
		john = new Person("John");  // we are creating a new person object, and assigning john to refer to it
		john.setAge(20);
		celebrateBirthday(john);  // we're passing that reference to a method, so the method can use that reference to manipulate the object
		System.out.println(john.getAge());
	}
	
	private static void celebrateBirthday(Person person) {
		person.setAge(person.getAge() + 1);
		
	}
	
	// manipulate a copy of the value passed
	static void addOneTo(int number) {
		number = number + 1;
	}
	
}
