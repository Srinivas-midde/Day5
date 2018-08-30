package com.capgemini.day5.collections;

import java.util.Objects;

public class School {
	
	private String name;
	private String city;
	private String district;
	private int greatSchoolRanking;
	private String schoolname;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String name, String city, String schoolname,String district, int greatSchoolRanking) {
		super();
		this.name = name;
		this.city = city;
		this.schoolname = schoolname;
		this.setDistrict(district);
		this.greatSchoolRanking = greatSchoolRanking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getSchoolname() {
		return schoolname;
	}
	public int getGreatSchoolRanking() {
		return greatSchoolRanking;
	}
	public void setGreatSchoolRanking(int greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}
	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schoolname=" + schoolname
				+ ", greatSchoolRanking=" + greatSchoolRanking + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(this.getClass()!= obj.getClass())
			return false;
		
		School school=(School) obj;
		return this.name==school.name && this.city==school.city && this.district==school.district;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,city,district);
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}

}
