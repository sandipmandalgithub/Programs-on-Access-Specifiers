package org;
import com.Car;
// ACCESSING PUBLIC MEMBERS OUTSIDE OF THE PACKAGE USING IMPORT STATEMENT

public class Car1 {

	public static void main(String[] args) {
	System.out.println("BRAND:"+Car.brand);
	Car c=new Car();
	System.out.println("COST:"+c.cost);
	c.start();

	}

}
