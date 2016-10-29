package apline;

public class APLineFreeResponse {
	public static void main(String[] args) {
		APLine line1 = new APLine(5, 4, -17);
		double slope1 = line1.getSlope();
		System.out.println("The slope of line1 is " + slope1 + ".");
		boolean online1 = line1.isOnLine(5, -2);
		System.out.println("line1 = APLine: " + online1);
		
		System.out.println();
		
		APLine line2 = new APLine(-25, 40, 30);
		double slope2 = line2.getSlope();
		System.out.println("The slope of line2 is " + slope2 + ".");
		boolean online2 = line2.isOnLine(5, -2);
		System.out.println("line2 = APLine: " + online2);
	}
}

