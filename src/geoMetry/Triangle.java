package geoMetry;

public class Triangle extends Product {

	private double pageLength;
	private double height;
	private double siteA;
	private double siteB;
	private double siteC;
	
	public Triangle(double x, double y, double pageLength, double height, double siteA, double siteB, double siteC) {
		super();
		this.pageLength = pageLength;
		this.height = height;
		this.siteA = siteA;
		this.siteB = siteB;
		this.siteC = siteC;
		this.setX(x);
		this.setY(y);
	}
	
	
	
	public double getPageLength() {
		return pageLength;
	}



	public void setPageLength(double pageLength) {
		this.pageLength = pageLength;
	}



	public double getHeight() {
		return height;
	}



	public void setHeight(double height) {
		this.height = height;
	}



	public double getSiteA() {
		return siteA;
	}



	public void setSiteA(double siteA) {
		this.siteA = siteA;
	}



	public double getSiteB() {
		return siteB;
	}



	public void setSiteB(double siteB) {
		this.siteB = siteB;
	}



	public double getSiteC() {
		return siteC;
	}



	public void setSiteC(double siteC) {
		this.siteC = siteC;
	}



	@Override
	public double calculateCircumferences() {
		return this.siteA + this.siteB + this.siteC;
	}

	@Override
	public double calculateArea() {
		return (0.5 * this.pageLength) * this.height;
	}

	public String toString() {
		return "|" + this.pageLength + "|" + this.height + "|" + this.siteA + "|" + this.siteB + "|" + this.siteC + "|"; 
	}
}
