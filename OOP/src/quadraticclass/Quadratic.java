package quadraticclass;

public class Quadratic {
	String a;
	String b;
	String c;
	
	public Quadratic(int a, int b, int c) {
		this.a = String.valueOf(a);
		this.b = String.valueOf(b);
		this.c = String.valueOf(c);
	}
		
	public String toString() {
		if(a == "1") {
			return "x^2 +" + b + "x + " + c;
		}
		else {
			return a + "x^2 + " + b + "x + " + c;
		}
		
	}
}
