package geoMetry;

public class Circle extends Product{
	
	private double radius;
	public final double pi = 3.14;
	

	public Circle(double x, double y, double radius) {
		super();
		this.radius = radius;
		this.setX(x);
		this.setY(y);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getPi() {
		return pi;
	}

	@Override
	public double calculateCircumferences() {
		return (2 * this.radius) * this.pi;
	}

	@Override
	public double calculateArea() {
		return (this.radius * this.radius) * this.pi;
	}

	public String toString() {
		return "| Radius: " + this.radius + " | Pi: " + this.pi + " |" + "\n" +
				"Umfang beträgt: " + this.calculateCircumferences() + "\n" + 
				"Fläche beträgt: " + this.calculateCircumferences() ; 
	}
	
}
