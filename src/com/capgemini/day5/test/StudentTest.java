package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.day5.domain.Student;
import com.capgemini.day5.exception.AgeNotWithinRangeException;
import com.capgemini.day5.exception.NameNotValidException;

class StudentTest {

	
	@Test
	void testStudent()throws NameNotValidException,AgeNotWithinRangeException {
		//	assertEquals(null,new Student(11,"Sr",21,"Java"));
			assertThrows(AgeNotWithinRangeException.class,()-> new Student(11,"Sri",22,"Java"));
			assertThrows(NameNotValidException.class,()-> new Student(11,"Sri1",21,"Java"));
		
	}

}
