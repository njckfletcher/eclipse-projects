package inorderequal;

public class InOrderEqual {
	public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
		if(a < b && b < c) {
			return true;
		}
		
		if(equalOk == true && (c >= b && b >= a)) {
			return true;
		}
		else {
			return false;
		}
	}
}
