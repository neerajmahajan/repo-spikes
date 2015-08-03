package org.hibernate.tutorials.domain;

public class Address {
	
	String street;
	String city;
	PersonDetails personDetails;
	
	public Address () {}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public PersonDetails getPersonDetails() {
		return personDetails;
	}
	public void setPersonDetails(PersonDetails personDetails) {
		this.personDetails = personDetails;
	}

}
