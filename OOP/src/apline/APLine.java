package apline;

public class APLine {
	double a;
	double b;
	double c;
	double slope;
	
	public APLine(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getSlope() {
		slope = -a / b;
		return slope;
	}
	
	public boolean isOnLine(int x, int y) {
		if((a*x) + (b*y)+ c == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
