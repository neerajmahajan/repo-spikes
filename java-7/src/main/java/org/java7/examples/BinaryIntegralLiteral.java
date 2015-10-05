package org.java7.examples;

public class BinaryIntegralLiteral {
	public static void main(String[] args) {

		char c = 0b101000;
		int n = 0b10001; // (0b) binary notation can be used with any integral
							// literal added in java7
		double d = 0b10010;
		System.out.println(c);
		System.out.println(n);
		System.out.println(d);
	}
}
