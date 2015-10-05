package org.java7.examples;

public class UnderscoresInNumericLiteral {
	public static void main(String[] args) {
		int oneLacMoreReadable = 1_00_000;
		System.out.println(oneLacMoreReadable);
	}

	/**
	 * More rules and examples
	 * 
	 * 1. Consecutive underscores is legal. int n = 1000______000;
	 * 2. Underscores can be included in other numeric types as well.
	 * double d = 1000_000.0d; long l = 1000_000l; int hex = 0xdead_c0de; int
	 * bytes = 0x1000_0000;
	 * 3. Underscore can be included after the decimal point.
	 * double example8 = 1000_000.000_000d;
	 * 4. It is illegal to start a literal with an underscore
	 * 5. It is illegal to end a literal with an underscore.
	 * 6. It is also illegal to have underscore be just before or after a
	 * decimal point.
	 */
}
