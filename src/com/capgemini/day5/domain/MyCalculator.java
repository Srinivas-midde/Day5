package com.capgemini.day5.domain;

import com.capgemini.day5.exception.MathException;
import com.capgemini.day5.exception.ZeroInputException;

public class MyCalculator {
	
	public long power(int n,int p) throws MathException,ZeroInputException {
		if(n<0 || p<0)
		{
			throw new MathException("n or p should be non-negative") ;
			//return 0 ;
		}
		else if(n==0 && p==0)
		{
			throw new ZeroInputException("n and p should not be zero") ;
			//return 0 ;
		}
		else
		{
			return (long)Math.pow(n, p) ;
		}
			
	}

}
