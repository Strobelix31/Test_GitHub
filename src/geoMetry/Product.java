package geoMetry;

public abstract class Product {

	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	} 
	
	public String toString() {
		return "|" + this.x + "|" + this.y + "|";
	}
	
	public abstract double calculateCircumferences();
	public abstract double calculateArea();
	
}
