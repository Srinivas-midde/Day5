package com.capgemini.day5.collections;

import java.util.Objects;

public class Car {
	
	private String make;
	private String model;
	private int year;
	private long price;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String make, String model, int year, long price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Car car=(Car) obj;
		return this.model==car.model && this.make==car.make;
		
	}
	
	@Override
	public int hashCode() {
	return Objects.hash(model,make);
	}
	
	

}
