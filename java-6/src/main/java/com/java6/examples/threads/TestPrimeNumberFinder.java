package com.java6.examples.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestPrimeNumberFinder {

	public static void main(String[] args) {

		PrimeNumberFinder primeNumberFinder = new PrimeNumberFinder(1, 20000);
		PrimeNumberFinder primeNumberFinder2 = new PrimeNumberFinder(20001, 40000);
		PrimeNumberFinder primeNumberFinder3 = new PrimeNumberFinder(40001, 60000);
		PrimeNumberFinder primeNumberFinder4 = new PrimeNumberFinder(60001, 80000);
		PrimeNumberFinder primeNumberFinder5 = new PrimeNumberFinder(80001, 100000);

		ExecutorService executorService = Executors.newFixedThreadPool(5);			// create 5 threads...
		executorService.execute(primeNumberFinder);
		executorService.execute(primeNumberFinder2);
		executorService.execute(primeNumberFinder3);
		executorService.execute(primeNumberFinder4);
		executorService.execute(primeNumberFinder5);

		executorService.shutdown();

	}

}
