package quadraticclass;

public class Quadratic {
	int myA;    // the 'a' in equation
	int myB;    // the 'b' in equation
	int myC;    // the 'c' in equation
	String myEquation;
	int myDisc; // b*b - 4*a*c
	
	// constructor
	public Quadratic(int a, int b, int c) {
		myA = a;
		myB = b;
		myC = c;
		findDisc();
		if(myA == 1) {
			myEquation = "x^2+" + String.valueOf(myB) + "x+" + String.valueOf(myC);
		}
		else {
			myEquation = String.valueOf(myA) + "x^2 + " + String.valueOf(myB) + "x + " + String.valueOf(myC);
		}
	}
	
	public String toString() {
		return myEquation;
	}
	
	// calculate first root
	public double getSolution1() {
		return (-myB + Math.sqrt(myDisc))/(2*myA);
	   	}
	
	// calculate second root
	public double getSolution2() {
		return (-myB - Math.sqrt(myDisc))/(2*myA);
	}
	   
	// check if there are real roots
	public boolean hasSolutions() {
		if (myDisc < 0) return false;
		else return true;
	}
	   
	// calculate discriminant
	private void findDisc() {
		myDisc = myB*myB - 4*myA*myC;
	}
}

