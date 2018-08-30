package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class Question3Test {
	
	ArrayList<String> array=new ArrayList<>();

	@Test
	void testOrder() {
		
		array.add("Sri");
		array.add("Vasu");
		array.add("Sid");
		array.add("Spa");
		array.add("Sree");
		assertEquals("Sri", array.get(0));
		assertEquals("Sid", array.get(2));
		
	}

}
