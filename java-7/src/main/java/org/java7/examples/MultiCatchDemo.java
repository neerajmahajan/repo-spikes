package org.java7.examples;

public class MultiCatchDemo {

	public static class Ex1 extends Exception {	};

	public static class Ex2 extends Exception {	};

	public static class Ex3 extends Exception {	};

	public static class Ex4 extends Exception {	};

	public static void main(String[] args) {

		try {
			doSomeThing();
		} catch (Ex1 | Ex2 ex) {

		} catch (Ex3 | Ex4 e) {
		}

	}

	private static void doSomeThing() throws Ex1, Ex2, Ex3, Ex4 {

	}
}
