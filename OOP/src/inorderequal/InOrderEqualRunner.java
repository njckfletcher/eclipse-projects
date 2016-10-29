package inorderequal;

public class InOrderEqualRunner {
	public static void main(String[] args) {
		InOrderEqual test = new InOrderEqual();
		boolean var;
		
		var = test.inOrderEqual(2, 5, 11, false);
		System.out.println(var);
		
		var = test.inOrderEqual(5, 7, 6, false);
		System.out.println(var);
		
		var = test.inOrderEqual(5, 5, 7, true);
		System.out.println(var);
	}
}
