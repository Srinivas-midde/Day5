package com.capgemini.day5domain;

import com.capgemini.day5.exception.CountryNotValidException;
import com.capgemini.day5.exception.EmployeeNameInvalidException;
import com.capgemini.day5.exception.TaxNotEligibleException;

public class TaxCalculator {

	public static double calculatorSimulator(String name, boolean i, double income) throws TaxNotEligibleException, EmployeeNameInvalidException, CountryNotValidException
	{
		
		
		if(name!="" && name!=null && i)
		{
			System.out.println("enter");
			if(income >= 1_00_000)
			{
				return income*0.08;
			}
			else if(income >= 50_000 && income < 1_00_000)
			{
				return income*0.06;
			}
			else if(income >= 30_000 && income < 50_000)
			{
				return income*0.05;
			}
			else if(income >= 10_000 && income < 30_000)
			{
				return income*0.04;
			}
			else
				throw new TaxNotEligibleException("Tax is not applicable for this Income.");
		}
		else if(name==""||name==null)
		{
			System.out.println("p");
			throw new EmployeeNameInvalidException("Give a valid employee name");
		}
		else if(!i)
		{
			System.out.println("v");
			throw new CountryNotValidException("Country is not valid");
		}
		
		return 10;
		
	}

}
