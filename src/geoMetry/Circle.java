package geoMetry;

public class Circle extends Product{
	
	public double radius;

	public Circle(double x, double y, double radius) {
		super();
		this.radius = radius;
		this.setX(x);
		this.setY(y);
	}
	
	@Override
	public double calculateCircumferences() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
