package com.java6.examples.clone;

public class Address implements Cloneable {
	final private String city;

	public Address(String city) {
		this.city = city;
	}

	// public String getCity() {
	// return new String(city);
	// }

	public String getCity() {
		return city;
	}

	 @Override
	 protected Address clone() throws CloneNotSupportedException {
	 return (Address) super.clone();
	 }
	 
	@Override
	public String toString() {
		return city;
	}
}