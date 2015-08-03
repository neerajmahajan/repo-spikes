package org.hibernate.tutorials.domain;

import java.util.Set;

public class Department {

	Integer id;
	String name;
	Set<Person> persons; // bidirectional one-to-many relationship

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Person> getPersons() {
		return persons;
	}
	
	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
}
