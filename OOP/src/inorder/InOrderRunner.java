package inorder;

public class InOrderRunner {
	public static void main(String[] args) {
		InOrder test = new InOrder();
		boolean var;
		
		var = test.inOrder(1, 2, 4, false);
		System.out.println(var);
		
		var = test.inOrder(1, 2, 1, false);
		System.out.println(var);
	}
}
