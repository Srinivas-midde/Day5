package com.capgemini.day5.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.day5.exception.CountryNotValidException;
import com.capgemini.day5.exception.EmployeeNameInvalidException;
import com.capgemini.day5.exception.TaxNotEligibleException;
import com.capgemini.day5domain.TaxCalculator;

class TaxCalculatorTest {

	@Test
	void testCalculateTaxValidInputs() throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException {
		
		//boolean n;
		assertEquals(8000.0, TaxCalculator.calculatorSimulator("John", true, 1_00_000));
		
		assertThrows(EmployeeNameInvalidException.class, ()->TaxCalculator.calculatorSimulator("",true,1_00_000));
		

	}
	
	@Test
	void testTaxNOtEligibleException() throws TaxNotEligibleException{
		
		assertThrows(TaxNotEligibleException.class, ()->TaxCalculator.calculatorSimulator("John",true,1000));
		
	}
	
	@Test
	void testEmployeeNameInvalidException() throws EmployeeNameInvalidException{
		
		assertThrows(EmployeeNameInvalidException.class, ()->TaxCalculator.calculatorSimulator("",true,1_00_000));
		
	}
	
	@Test
	void testCountryNotValidException() throws CountryNotValidException{
		
		assertThrows(CountryNotValidException.class, ()->TaxCalculator.calculatorSimulator("John",false,1_00_000));
		
	}


}
