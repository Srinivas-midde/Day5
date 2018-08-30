package com.capgemini.day5.collections;

public class Student implements Comparable<Student>{
	
	private String name;
	private int rollno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name,int rollno) {
		super();
		this.name = name;
		this.setRollno(rollno);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public int compareTo(Student s1) {
		int result = this.name.compareTo(s1.name);
		if(result == 0)
			return Integer.compare(this.rollno, s1.rollno);
		return result;
	}

	@Override
	public String toString() {
//		return "Student [name=" + name + ", rollno=" + rollno + "]";
		return "name=" + name ;
	}
	
	
	
	
//	@Override
//	public int compareTo(Camera c2) {
//		//int result = Double.compare(this.price, c2.price);
//		int result = this.brand.compareTo(c2.brand);
//		if(result == 0)
//			return this.model.compareTo(c2.model);
//		return result;
//	}

	

}
