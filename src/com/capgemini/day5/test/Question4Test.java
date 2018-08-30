package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.collections.Student;

class Question4Test {

	@Test
	void testoutputorder() {
		
		TreeSet<Student> names=new TreeSet<>();
		
		assertEquals(true, names.add(new Student("Sri",1)));
		assertEquals(true, names.add(new Student("Sree",2)));
		assertEquals(true, names.add(new Student("S",3)));
		assertEquals(true, names.add(new Student("Sr",4)));
		


		
		Iterator<Student> itr = names.iterator();
		assertEquals("name=S",itr.next().toString());

	}

}
