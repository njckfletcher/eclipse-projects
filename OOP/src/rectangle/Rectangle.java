package rectangle;

public class Rectangle {
	double length;
	double width;
	
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	// default rectangle class; manipulated with accessor and mutator methods
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}
	
	public void setLength(double l) {
		this.length = l;
	}
	
	public void setWidth(double w) {
		this.width = w;
	}
	
	public double getArea() {
		return  length*width;
	}
	
	public double getPerimeter() {
		return (length*2) + (width*2);
	}
}
