package com.capgemini.day5.collections;

import java.util.ArrayList;

public class WorkingWithCollections {
	public static void main(String[] args) {
		
		ArrayList<Laptop> laptop = new ArrayList<Laptop>();
		
		
		laptop.add(new Laptop("fdgd","dfgd","dfgd","dfgdf"));

		laptop.add(new Laptop("fdgd","dfgd","dfgd","dfgdf"));

		laptop.add(new Laptop("fdgd","dfgd","dfgd","dfgdf"));
		
		for (Laptop lap : laptop) {
			System.out.println(lap.getCompany() + " " + lap.getModel());
		}
		
	
	}
}
