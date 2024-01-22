package geoMetry;

import java.util.ArrayList;
import java.util.Collections;

public class Group {

	ArrayList<Product> product = new ArrayList<Product>();
	
	public void addProduct(Product product) {
		this.product.add(product);
	}
	
	public void removeProduct(Product product) {
		this.product.remove(product);
	}
	
	public double overallArea() {
		double area = 0;
		for(Product p : this.product) {
			area += p.calculateArea();
		}
		return area;
	}
	
	public double overallCircumference() {
		double circumference = 0;
		for(Product p : this.product) {
			circumference += p.calculateCircumferences();
		}
		return circumference;
	}
	
	public void printProduct(){
		for(Product p : this.product) {
			System.out.println(p);
		}
	}
	
	public double highestArea() {
		double max = 0;
		for (Product p : this.product) {
		if(p.calculateArea()>max) {
			max = p.calculateArea();
			System.out.println("Biggest Body: " + p.toString());
			}
		}
		return max;
	}
}
