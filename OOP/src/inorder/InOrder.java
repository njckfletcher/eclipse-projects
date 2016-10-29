package inorder;

public class InOrder {
	public boolean inOrder(int a, int b, int c, boolean bOk) {
		if(bOk == false && b > a && c > b) {
			return true;
		}
		else if(bOk == true && c > b) {
			return true;
		}
		else {
			return false;
		}
	}
}
