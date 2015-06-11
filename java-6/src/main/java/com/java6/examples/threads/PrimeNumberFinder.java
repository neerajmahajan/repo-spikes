package com.java6.examples.threads;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumberFinder implements Runnable {

	private long start;
	private long stop;
	
	public PrimeNumberFinder(long start, long stop){
		this.start = start;
		this.stop = stop;
	}

	public void run() {
		
		List<Long> primeNumberList =  new ArrayList<Long>();
		
		for(long i=start;i<= stop; start ++){
			if(isPrime(i));{
				primeNumberList.add(i);
			}
		}
	}

	protected boolean isPrime(long number) {
		boolean primeNumber = true;

		if (number == 2) {
			return primeNumber;
		}
		
		for (int divisor = 3; divisor < number; divisor++)
			if (number % divisor == 0) {
				return false;
			}
		return primeNumber;
	}

}
