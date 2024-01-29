package geoMetry;

import java.util.ArrayList;
import java.util.Collections;

public class Group {

	ArrayList<Product> product = new ArrayList<Product>();
	
	/**
	 * Adds a body to the list of all products
	 * @param product
	 */
	public void addProduct(Product product) {
		this.product.add(product);
	}
	
	/**
	 * Removes a body from the list of all products 
	 * @param product
	 */
	public void removeProduct(Product product) {
		this.product.remove(product);
	}
	
	/**
	 * calculates the whole area of all products
	 * @return
	 */
	public double overallArea() {
		double area = 0;
		for(Product p : this.product) {
			area += p.calculateArea();
		}
		return area;
	}
	
	/**
	 * calculates the whole circumference of all products 
	 * @return
	 */
	public double overallCircumference() {
		double circumference = 0;
		for(Product p : this.product) {
			circumference += p.calculateCircumferences();
		}
		return circumference;
	}
	
	/**
	 * prints out all products from the list on the console
	 */
	public void printProduct(){
		for(Product p : this.product) {
			System.out.println(p);
		}
	}
	
	/**
	 * prints out the product with the biggest area
	 * @return the area of this body
	 */
	public Product biggestBody() {
	    Product maxBody = this.product.get(0);
	    for(Product p : this.product) {
	        if(p.calculateArea() > maxBody.calculateArea()) {
	            maxBody = p;
	        }
	    }
	    System.out.println("Biggest Body:\n\t" + maxBody.toString());
	    return maxBody;
	}

}

