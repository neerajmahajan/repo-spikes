package com.java6.examples.clone;

public class Person implements Cloneable {
	Integer age;
	Address address;
	DOB dob;
	String name;

	Person(Integer age, Address address, String name, DOB dob) {
		this.age = age;
		this.address = address;
		this.name = name;
		this.dob = dob;
	}
	
	public void setDob(DOB dob) {
		this.dob = dob;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	protected Person clone() throws CloneNotSupportedException {
		Person p = (Person) super.clone();
		p.address = address.clone();
		return p;
	}

	@Override
	public String toString() {
		return age + " " + address.getCity() + " " + dob;
	}

}