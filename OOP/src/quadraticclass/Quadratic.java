package quadraticclass;

public class Quadratic {
	int baseA;
	int baseB; 
	int baseC;
	String equation;
	int disc; 
	
	public Quadratic(int a, int b, int c) {
		baseA = a;
		baseB = b;
		baseC = c;
		findDisc();
		if(baseA == 1) {
			equation = "x^2+" + String.valueOf(baseB) + "x+" + String.valueOf(baseC);
		}
		else {
			equation = String.valueOf(baseA) + "x^2 + " + String.valueOf(baseB) + "x + " + String.valueOf(baseC);
		}
	}
	
	public String toString() {
		return equation;
	}
	
	public double getSolution1() {
		return (-baseB + Math.sqrt(disc))/(2*baseA);
	   	}
	
	public double getSolution2() {
		return (-baseB - Math.sqrt(disc))/(2*baseA);
	}
	   
	public boolean hasSolutions() {
		if (disc < 0) return false;
		else return true;
	}
	   
	private void findDisc() {
		disc = baseB*baseB - 4*baseA*baseC;
	}
}

