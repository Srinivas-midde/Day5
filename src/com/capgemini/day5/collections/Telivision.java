package com.capgemini.day5.collections;

import java.util.Objects;

public class Telivision {
	
	private String company;
	private String type;
	private boolean enabled_3D;
	private int price;
	
	public Telivision() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telivision(String company, String type, boolean enabled_3d, int price) {
		super();
		this.company = company;
		this.type = type;
		enabled_3D = enabled_3d;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isEnabled_3D() {
		return enabled_3D;
	}

	public void setEnabled_3D(boolean enabled_3d) {
		enabled_3D = enabled_3d;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Telivision [company=" + company + ", type=" + type + ", enabled_3D=" + enabled_3D + ", price=" + price
				+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		Telivision tv=(Telivision) obj;
		return this.company==tv.company && this.type==tv.type;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(company,type);
	}

}
