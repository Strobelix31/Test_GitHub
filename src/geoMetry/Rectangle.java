package geoMetry;

public class Rectangle extends Product{

	private double length;
	private double width;
	
	public Rectangle(double x, double y, double length, double width) {
		super();
		this.length = length;
		this.width = width;
		this.setX(x);
		this.setY(y);
	}
	
	
	
	public double getLength() {
		return length;
	}



	public void setLength(double length) {
		this.length = length;
	}



	public double getWidth() {
		return width;
	}



	public void setWidth(double width) {
		this.width = width;
	}



	@Override
	public double calculateCircumferences() {
		return (this.length * 2) + (this.width * 2);
	}
	@Override
	public double calculateArea() {
		return (this.length * this.length) + (this.width * this.width);
	}
	
	
	public String toString() {
		return "| Länge: " + this.length + " | Breite: " + this.width + " |" + "\n" + "Umfang beträgt: " +
		this.calculateCircumferences() + "\n" + "Fläche beträgt: " +
		this.calculateArea() ; 
	}	 
	
}
